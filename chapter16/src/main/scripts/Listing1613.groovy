import groovy.transform.ToString
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ASTTransformationCustomizer
import org.codehaus.groovy.control.customizers.SourceAwareCustomizer

def conf = new CompilerConfiguration()
def astCustomizer = new ASTTransformationCustomizer(ToString) //# 1
def sourceAwareCustomizer = new SourceAwareCustomizer(astCustomizer) //# 2
sourceAwareCustomizer.baseNameValidator = { name -> name.endsWith 'Bean' } //# 3
conf.addCompilationCustomizers(sourceAwareCustomizer)
