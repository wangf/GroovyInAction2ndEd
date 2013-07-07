/**
 * Chapter 06
 * Section 6.1.2
 * Listing 6.2
 */

def x = 1

if (x == 2) {                //#1
    assert false
}
/*******************
 if (x =  2) {               //#2
 println x}********************/
if ((x = 3)) {              //#3
    println x
}
assert x == 3

def store = []
while (x = x - 1) {         //#4
    store << x
}
assert store == [2, 1]

while (x = 1) {
    println x                //#5
    break
}
