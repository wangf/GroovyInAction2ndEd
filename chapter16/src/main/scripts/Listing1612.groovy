import groovy.transform.ThreadInterrupt
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ASTTransformationCustomizer

def conf = new CompilerConfiguration() //# 1
def customizer = new ASTTransformationCustomizer(ThreadInterrupt) //# 2
conf.addCompilationCustomizers(customizer) //# 3
def shell = new GroovyShell(conf) //# 4
def t = Thread.start {
    def value = shell.evaluate('while (true){}') //# 5
}
t.join(1000) //# 6
t.interrupt() //# 7
