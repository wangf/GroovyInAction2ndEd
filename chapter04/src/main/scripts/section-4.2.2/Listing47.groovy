/**
 * Chapter 04
 * Section 4.2.2
 * Listing 4.7
 */

myList = ['a', 'b', 'c']

assert myList.isCase('a')
candidate = 'a'
switch (candidate) {
    case myList: assert true; break   //#1
    default: assert false
}

assert ['x', 'a', 'z'].grep(myList) == ['a']   //#2

myList = []
if (myList) assert false                   // #3

// Lists can be iterated with a 'for' loop
log = ''
for (i in [1, 'x', 5]) {                   //#4
    log += i
}
assert log == '1x5'

