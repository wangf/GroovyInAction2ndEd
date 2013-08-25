def gcl = new GroovyClassLoader()
Class greetingClass = gcl.parseClass(new File("Hello.groovy"))
assert "Hello!" == greetingClass.newInstance().greeting()
