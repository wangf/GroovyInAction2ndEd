/**
 * Chapter 08
 * Section 8.4.4
 * Listing 8.12
 */

class MyGroovy1 {}

def before = new MyGroovy1()

MyGroovy1.metaClass.myProp = "MyGroovy prop"
MyGroovy1.metaClass.test = { -> myProp }

try {
    before.test()                   //#1
    assert false, "should throw MME"
} catch (mme) {
}

assert new MyGroovy1().test() == "MyGroovy prop"

