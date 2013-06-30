/**
 * Chapter 04
 * Section 4.2.2
 * Listing 4.6
 */

myList = []

myList += 'a'                   //#A
assert myList == ['a']

myList += ['b','c']            // #B
assert myList == ['a','b','c']

myList = []
myList <<  'a' << 'b'          // #C
assert myList == ['a','b']

assert myList - ['b'] == ['a']   //#D

assert myList * 2 == ['a','b','a','b']   //#E

