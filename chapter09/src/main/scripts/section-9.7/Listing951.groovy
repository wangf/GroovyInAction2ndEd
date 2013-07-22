import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.tools.ast.TransformTestHelper
import transforms.global.CompiledAtASTTransformation

/**
 * Chapter 09
 * Section 9.7
 * Listing 9.51
 */
def transform = new CompiledAtASTTransformation()
def phase = CompilePhase.CONVERSION
def helper = new TransformTestHelper(transform, phase)
def clazz = helper.parse(' class MyClass {} ')
assert clazz.getCompiledTime() != null


