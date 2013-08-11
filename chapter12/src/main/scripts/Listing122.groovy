/**
 * Chapter 12
 * Listing 12.2
 */

class MyClass {
    def first = 1                   // read-write property
    def getSecond() { first * 2 }   // read-only  property
    public third = 3                // public field property

    def myMethod() {}              // public method
}

obj = new MyClass()

assert obj.hasProperty('first')            //#1
assert obj.respondsTo('myMethod')          //#2

keys = ['first', 'second', 'third',
        'class', 'metaClass']

println "Properties KeySet   = ${obj.properties.keySet()}"
println "new HashSet of Keys = ${new HashSet(keys)}"

//assert obj.properties.keySet() == new HashSet(keys)

assert 1 == obj.properties['first']         //#3
assert 1 == obj.properties.first            //#3

assert 1 == obj.first                               //#4
assert 1 == obj['first']    // getAt('first')       //#4

one = 'first'
two = 'second'
obj[one] = obj[two]         // putAt(one)           //#5
assert obj.dump()=~'first=2'                      //#6


groovy.inspect.swingui.ObjectBrowser.inspect(obj)

