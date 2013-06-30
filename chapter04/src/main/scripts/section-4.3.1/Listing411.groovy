/**
 * Chapter 04
 * Section 4.3.1
 * Listing 4.11
 */

def myMap = [a: 1, b: 2, c: 3]

assert myMap instanceof HashMap
assert myMap.size() == 3
assert myMap['a'] == 1

def emptyMap = [:]
assert emptyMap.size() == 0

def explicitMap = new TreeMap()
explicitMap.putAll(myMap)
assert explicitMap['a'] == 1

assert ['a': 1] == [a: 1]

def x = 'a'
assert ['x':1] == [x:1]
assert ['a':1] == [(x):1]
