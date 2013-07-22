import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.builder.AstBuilder
/**
 * Chapter 09
 * Section 9.6.3
 * Listing 9.40
 */
import org.codehaus.groovy.control.CompilePhase

def ast = new AstBuilder().buildFromString(
        CompilePhase.CLASS_GENERATION,
        false,
        ' static String getCompiledTime() { "' + new Date().toString() + '" } '
)

assert ast[1] instanceof ClassNode
def method = ast[1].methods.find { it.name == 'getCompiledTime' }
assert method instanceof MethodNode
