import groovy.transform.TimedInterrupt
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ASTTransformationCustomizer

import java.util.concurrent.TimeoutException

import static groovy.test.GroovyAssert.shouldFail

def config = new CompilerConfiguration()                         //#2
config.addCompilationCustomizers(                                //#2
        new ASTTransformationCustomizer(value: 2, TimedInterrupt)    //#2
)
def shell = new GroovyShell(config)
def te = shouldFail(TimeoutException) {
    shell.evaluate '''
       for (i in 1..1000) {                                  //#1
         sleep 1000                                          //#1
       }
    '''
}
println te.message
