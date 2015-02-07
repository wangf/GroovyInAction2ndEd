/**
 * Chapter 04
 * Section 4.2.2
 * Listing 4.7
 *
 * 07-Feb-2015
 */

myList = ['a', 'b', 'c']

assert myList.isCase('a')
assert 'b' in myList

def candidate = 'c'
switch (candidate) {
    case myList: assert true; break                   //#1
    default: assert false
}

assert ['x', 'a', 'z'].grep(myList) == ['a']             //#2

myList = []
if (myList) assert false                               //#3

// Lists can be iterated with a 'for' loop
def expr = ''
for (i in [1, '*', 5]) {                                  //#4
    expr += i
}
assert expr == '1*5'
