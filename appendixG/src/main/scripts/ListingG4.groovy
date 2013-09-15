import com.manning.groovyinaction.MyClassLoader

GroovyClassLoader loader = new MyClassLoader()
Class clazz = loader.parseClass(' "Hello from Groovy!" ')
Script script = clazz.newInstance()
assert "Hello from our Visitor!" == script.run()


