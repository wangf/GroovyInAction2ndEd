def binding = new Binding()
def shell = new GroovyShell(binding)
shell.evaluate('''
    def localVariable = "local variable"
    bindingVariable   = "binding variable"
''')

assert binding.getVariable("bindingVariable") == "binding variable"
assert binding.getVariable("localVariable") == "binding variable"
