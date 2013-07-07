/**
 * Chapter 06
 * Section 6.3.2
 * Listing 6.9
 */

def store = ''                         //#1
for (String i in 'a'..'c') store += i  //#1
assert store == 'abc'                  //#1

store = ''              //#2
for (i in [1, 2, 3]) {  //#2
    store += i          //#2
}                       //#2
assert store == '123'   //#2

def myString = 'Equivalent to Java'  //#3
store = ''                           //#3
for (i in 0..<myString.size()) {   //#3
    store += myString[i]             //#3
}                                    //#3
assert store == myString             //#3

store = ''                //#4
for (i in myString) {     //#4
    store += i            //#4
}                         //#4
assert store == myString  //#4 

