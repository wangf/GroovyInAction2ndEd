import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

def conf = new CompilerConfiguration()
def customizer = new ImportCustomizer()
customizer.addImports('java.util.concurrent.atomic.AtomicInteger', 'java.util.concurrent.atomic.AtomicLong')
conf.addCompilationCustomizers(customizer)
def shell = new GroovyShell(conf)
def value = shell.evaluate('''
    def myInt = new AtomicInteger(1)
    def myLong = new AtomicLong(2)
''')
