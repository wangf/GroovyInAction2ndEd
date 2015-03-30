package xform

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ASTTransformationCustomizer

def binding = new Binding([customer: [name: 'John Doe', age: 32]])  //#1

def config = new CompilerConfiguration()                            //#2
config.scriptBaseClass = BusinessLogicScript.class.name             //#3
config.addCompilationCustomizers(                                   //#4
        new ASTTransformationCustomizer(CustomControlStructure))        //#4

def shell = new GroovyShell(this.class.classLoader, binding, config)  //#5
def result = shell.evaluate '''
    when (customer.age >= 21) {
        "Alcohol allowed for ${customer.name}"
    }
'''                                                                 //#6
assert result == "Alcohol allowed for John Doe"                     //#7
//#1 Populate binding with customer
//#2 Config instance
//#3 Define base script
//#4 Inject transform annotation
//#5 Create configured shell
//#6 Evaluate script
//#7 Confirm result
