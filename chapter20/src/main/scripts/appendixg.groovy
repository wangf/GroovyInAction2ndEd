import org.codehaus.groovy.ast.ClassCodeVisitorSupport
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.GroovyCodeVisitor
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.ast.stmt.SynchronizedStatement

synchronized (getClass()) {
    println 'doing something...'
}


class SynchronizedOnGetClassAstVisitor extends GroovyCodeVisitor {

    void visitSynchronizedStatement(SynchronizedStatement statement) {

        if (statement.expression instanceof MethodCallExpression) {
            def method = statement.expression
            def argumentCount = 0
            if (AstUtil.isMethodNamed(method, 'getClass', argumentCount)) {
                addViolation statement
            }
        }
        super.visitSynchronizedStatement(statement);
    }
}


ClassLoader loader = new GroovyClassLoader()
Class clazz = loader.parseClass(' "Hello from Groovy!" ')
Script script = clazz.newInstance()
assert "Hello from Groovy!" == script.run()


ClassLoader loader = new MyClassLoader()
Class clazz = loader.parseClass(' "Hello from Groovy!" ')
Script script = clazz.newInstance()
assert "Hello from our Visitor!" == script.run()

import org.codehaus.groovy.classgen.GeneratorContext
import org.codehaus.groovy.control.CompilationUnit
import org.codehaus.groovy.control.CompilationUnit.PrimaryClassNodeOperation
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.Phases
import org.codehaus.groovy.control.SourceUnit

import java.security.CodeSource

class MyAstVisitor extends ClassCodeVisitorSupport {
    def source

    void visitConstantExpression(ConstantExpression exp) {
        if (exp.value instanceof String) {
            exp.value = 'Hello from our Visitor!'
        }
    }

    SourceUnit getSourceUnit() {
        source
    }
}

class MyClassLoader extends GroovyClassLoader {
    protected CompilationUnit createCompilationUnit(
            CompilerConfiguration cfg,
            CodeSource src) {

        CompilationUnit cu = super.createCompilationUnit(cfg, src)
        def operation = new MyClassNodeOperation()
        def phase = Phases.SEMANTIC_ANALYSIS
        cu.addPhaseOperation(operation, phase)
        cu
    }
}

private class MyClassNodeOperation extends PrimaryClassNodeOperation {

    void call(SourceUnit src, GeneratorContext ctx, ClassNode node) {
        node.visitContents(new MyAstVisitor(source: src))
    }
}
