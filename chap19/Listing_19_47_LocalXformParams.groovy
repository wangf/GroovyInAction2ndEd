import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ASTTransformationCustomizer

def config = new CompilerConfiguration()
config.addCompilationCustomizers(
        new ASTTransformationCustomizer(                    //#1
                value: [Value, Mult, Add], Newify)              //#1
)
def shell = new GroovyShell(
        this.class.classLoader, new Binding(), config)      //#2

def term3 = shell.evaluate '''
    Mult(                                               //#3
        Value('a'),                                     //#3
        Add(                                            //#3
            Value('b'),                                 //#3
            Value('c')                                  //#3
        )                                               //#3
    )                                                   //#3
'''

assert term3.toString() == 'Mult(Value(a), Add(Value(b), Value(c)))'
//#1 Pass annotation and parameters to customizer
//#2 Pass config to GroovyShell
//#3 Implicit Newify
