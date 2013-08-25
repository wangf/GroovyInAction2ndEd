import org.codehaus.groovy.control.CompilerConfiguration

def conf = new CompilerConfiguration()
conf.setScriptBaseClass("BaseScript")
def shell = new GroovyShell(conf)
def value = shell.evaluate('''
    multiply(5, 6)
''')
assert value == 30
