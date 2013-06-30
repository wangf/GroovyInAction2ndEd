/**
 * Chapter 04
 * Section 4.3.2
 * Listing 4.14
 */

def myMap = [a: 1, b: 2, c: 3]

def store = ''
myMap.each { entry ->       //#A
    store += entry.key     //#A
    store += entry.value   //#A
}                          //#A
assert store.contains('a1')
assert store.contains('b2')
assert store.contains('c3')

store = ''
myMap.each { key, value ->   //#B
    store += key            //#B
    store += value          //#B
}                           //#B
assert store.contains('a1')
assert store.contains('b2')
assert store.contains('c3')

store = ''
for (key in myMap.keySet()) {   //#C
    store += key                //#C
}                               //#C
assert store.contains('a')
assert store.contains('b')
assert store.contains('c')

store = ''
for (value in myMap.values()) {   //#D
    store += value                //#D
}                                 //#D
assert store.contains('1')
assert store.contains('2')
assert store.contains('3')
