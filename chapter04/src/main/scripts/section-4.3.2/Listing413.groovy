/**
 * Chapter 04
 * Listing 4.13
 *
 * 07-Feb-2015
 */

def myMap = [a: 1, b: 2, c: 3]

assert myMap['a'] == 1                           //#A
assert myMap.a == 1                           //#A
assert myMap.get('a') == 1                           //#A
assert myMap.get('a', 0) == 1                           //#A

assert myMap['d'] == null                        //#B
assert myMap.d == null                        //#B
assert myMap.get('d') == null                        //#B

assert myMap.get('d', 0) == 0                           //#C
assert myMap.d == 0                           //#C

myMap['d'] = 1                                         //#D
assert myMap.d == 1                                    //#D
myMap.d = 2                                            //#D
assert myMap.d == 2                                    //#D

