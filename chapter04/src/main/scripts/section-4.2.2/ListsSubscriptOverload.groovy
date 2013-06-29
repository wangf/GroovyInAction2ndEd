/**
 * Chapter 04
 * Section 4.2.2
 */
myList = ['a', 'b', 'c', 'd', 'e', 'f']

assert myList[0..2] == ['a', 'b', 'c']   //#A
assert myList[0, 2, 4] == ['a', 'c', 'e']   //#B

myList[0..2] = ['x', 'y', 'z']   //#C
assert myList == ['x', 'y', 'z', 'd', 'e', 'f']

myList[3..5] = []                         // #1
assert myList == ['x', 'y', 'z']

myList[1..1] = ['y', '1', '2']                //#2
assert myList == ['x', 'y', '1', '2', 'z']      



