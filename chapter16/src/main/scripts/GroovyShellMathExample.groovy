import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def conf = new CompilerConfiguration()
def customizer = new ImportCustomizer()
customizer.addStarImports 'java.lang.Math'
customizer.addStaticImport 'π', 'java.lang.Math', 'PI'
customizer.addStaticImport 'cos', 'java.lang.Math', 'cos'
conf.addCompilationCustomizers(customizer)
def shell = new GroovyShell(conf)
def value = shell.evaluate('cos(π/2)')

