import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.classgen.GeneratorContext
import org.codehaus.groovy.control.CompilationUnit
import org.codehaus.groovy.control.CompilationUnit.PrimaryClassNodeOperation
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.Phases
import org.codehaus.groovy.control.SourceUnit

import java.security.CodeSource

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

    private class MyClassNodeOperation extends PrimaryClassNodeOperation {

        void call(SourceUnit src, GeneratorContext ctx, ClassNode node) {
            node.visitContents(new MyAstVisitor(source: src))
        }
    }

}

