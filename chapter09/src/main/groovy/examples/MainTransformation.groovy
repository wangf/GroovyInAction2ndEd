package examples

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.AnnotationNode
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit

/**
 * Chapter 09
 * Section 9.2.7
 * Listing 9.26
 */
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@GroovyASTTransformation(phase = CompilePhase.INSTRUCTION_SELECTION)
public class MainTransformation implements ASTTransformation {

    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        // use guard clauses as a form of defensive programming.
        if (!astNodes) return
        if (!astNodes[0] || !astNodes[1]) return
        if (!(astNodes[0] instanceof AnnotationNode)) return
        if (astNodes[0].classNode?.name != Main.class.name) return
        if (!(astNodes[1] instanceof MethodNode)) return

        MethodNode annotatedMethod = astNodes[1]
        ClassNode declaringClass = annotatedMethod.declaringClass
        MethodNode mainMethod = makeMainMethod(annotatedMethod)
        declaringClass.addMethod(mainMethod)
    }

    MethodNode makeMainMethod(MethodNode source) {
        def className = source.declaringClass.name
        def methodName = source.name

        def phase = CompilePhase.INSTRUCTION_SELECTION
        def ast = new AstBuilder().buildFromString(phase, false, """
            package $source.declaringClass.packageName

            class $source.declaringClass.nameWithoutPackage {
                public static void main(String[] args) {
                    new $className().$methodName()
                }
            }
        """)
        ast[1].methods.find { it.name == 'main' }
    }
}

