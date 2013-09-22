import groovy.transform.CompileStatic

class MyFramework {
    static int sizeOf(String s) { s.size() }        //#1
    @CompileStatic
    static int staticSizeOf(String s) { s.size() }    //#2
}

String s = 'a happy new year!'
s.metaClass.size = { -> 5 }                //#3
assert s.size() == 5                    //#4
assert MyFramework.sizeOf(s) == 5                //#5
assert MyFramework.staticSizeOf(s) == 17            //#6
