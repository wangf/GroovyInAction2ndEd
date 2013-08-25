import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.classgen.GeneratorContext
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.control.customizers.CompilationCustomizer
import org.codehaus.groovy.syntax.SyntaxException

class HasNameFieldCustomizer extends CompilationCustomizer {
    HasNameFieldCustomizer() {
        super(CompilePhase.CANONICALIZATION) //# 1
    }


    void call(SourceUnit source, GeneratorContext context, ClassNode classNode) {
        def field = classNode.getDeclaredField('name')
        if (field) {
            if (!field.type.equals(ClassHelper.STRING_TYPE)) {
                source.addError(
                        new SyntaxException("Class ${classNode.name} defines field ‘name’ but using the wrong type"), field.lineNumber, field.columnNumber)
            }
        } else {
            source.addError(
                    new SyntaxException("Class ${classNode.name} doesn’t define a field named 'name' of type 'String' ", classNode.lineNumber, classNode.columnNumber))
        }
    }
}