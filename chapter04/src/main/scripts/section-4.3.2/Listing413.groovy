/**
 * Chapter 04
 * Section 4.3.2
 * Listing 4.13
 */


def myMap = [a:1, b:2, c:3]
def other = [b:2, c:3, a:1]
assert myMap == other                                  //#A
assert myMap.isEmpty()  == false                       //#B
assert myMap.size()     == 3                           //#B
assert myMap.containsKey('a')                          //#B
assert myMap.containsValue(1)                          //#B
assert myMap.keySet()        == toSet(['a','b','c'])   //#B
assert toSet(myMap.values()) == toSet([1,2,3])         //#B
assert myMap.entrySet() instanceof Collection          //#B

assert myMap.any   {entry -> entry.value > 2  }        //#1
assert myMap.every {entry -> entry.key   < 'd'}        //#1

def toSet(list){                  //#C
    new java.util.HashSet(list)   //#C
}                                 //#C
