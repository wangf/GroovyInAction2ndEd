class Person {
    static {
        def mc = new ExpandoMetaClass(Person, false, true) //# 1
        mc.initialize()
        Person.metaClass = mc
    }
    String name = "Fred"

    void methodMissing(String name, args) {
        if (name.startsWith('changeNameTo')) {
            println "Adding method $name"
            String newName = name.substring(12)
            def newMethod = { delegate.name = newName } //# 2
            Person.metaClass."$name" = newMethod //# 3
            newMethod() //# 4
        } else {
            throw new MissingMethodException(name, this.class, args)
        }
    }
}

def p = new Person()
assert "Fred" == p.name
p.changeNameToBob()
assert "Bob" == p.name
p.changeNameToJohn()
assert "John" == p.name
p.changeNameToBob()
