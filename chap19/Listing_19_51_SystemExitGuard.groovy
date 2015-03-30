import org.codehaus.groovy.ast.ClassCodeVisitorSupport
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.classgen.GeneratorContext
import org.codehaus.groovy.control.CompilationFailedException
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.control.customizers.CompilationCustomizer
import org.codehaus.groovy.syntax.SyntaxException

import static groovy.test.GroovyAssert.shouldFail
import static org.codehaus.groovy.control.CompilePhase.CANONICALIZATION

def config = new CompilerConfiguration()
def filter = new CompilationCustomizer(CANONICALIZATION) {          //#1
    void call(SourceUnit src, GeneratorContext ctxt, ClassNode cn) {  //#2
        new ClassCodeVisitorSupport() {                                 //#3
            void visitMethodCallExpression(MethodCallExpression call) {   //#4
                if (call.objectExpression.text == 'java.lang.System' &&     //#5
                        call.method.text == 'exit') {                               //#5
                    src.addError(new SyntaxException(                         //#6
                            'System.exit() forbidden',                            //#6
                            call.lineNumber, call.columnNumber))                  //#6
                }
                super.visitMethodCallExpression(call)
            }

            SourceUnit getSourceUnit() { src }
        }.visitClass(cn)
    }
}
config.addCompilationCustomizers(filter)

def shell = new GroovyShell(config)
def ce = shouldFail(CompilationFailedException) {
    shell.parse '''
    System.exit(0)
  '''
}
println ce.message
//#1 Extend CompilationCustomizer
//#2 Override call method
//#3 Define visitor
//#4 Override method call visits
//#5 Detect System.exit
//#6 Flag error
