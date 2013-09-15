GroovyClassLoader loader = new GroovyClassLoader()
Class clazz = loader.parseClass(' "Hello from Groovy!" ')
Script script = clazz.newInstance()
assert "Hello from Groovy!" == script.run()
