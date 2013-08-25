def engine = new GroovyScriptEngine(".")
def value  = engine.run("test/MyScript.groovy", new Binding())


def engine1 = new GroovyScriptEngine(".")
def clazz  = engine1.loadScriptByName("test.MyScript")
