package regina

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassNode

/**
 * Listing 9.36
 */
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

import static org.objectweb.asm.Opcodes.ACC_PUBLIC
import static org.objectweb.asm.Opcodes.ACC_STATIC

@GroovyASTTransformation(phase = CompilePhase.CONVERSION)
class CompiledAtASTTransformation implements ASTTransformation {

    private static final compileTime = new Date().toString()

    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        List classes = sourceUnit.ast?.classes
        classes.each { ClassNode clazz ->
            clazz.addMethod(makeMethod())
        }
    }

    MethodNode makeMethod() {
        def ast = new AstBuilder().buildFromSpec {
            method('getCompiledTime', ACC_PUBLIC | ACC_STATIC, String) {
                parameters {}
                exceptions {}
                block {
                    returnStatement {
                        constant(compileTime)
                    }
                }
                annotations {}
            }
        }
        ast[0]
    }
}
