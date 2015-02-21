def shell = new GroovyShell()
def clazz = shell.evaluate('''
    class MyClass {                //#A
        def method() { "value" }   //#A
    }                              //#A
    return MyClass                 //#A
''')
assert clazz.name == "MyClass"
def instance = clazz.newInstance()       //#B
assert instance.method() == "value"      //#C
