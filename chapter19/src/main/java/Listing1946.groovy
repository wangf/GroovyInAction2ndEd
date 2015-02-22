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
