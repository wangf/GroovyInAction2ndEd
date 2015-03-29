

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

//#1 Explicit typing, over string range, no braces
//#2 Implicit typing, over list as collection, braces
//#3 Explicit typing, Java-style traditional for loop, braces
//#4 Explicit typing, Java-style iterable index, braces
//#5 Implicit typing, over half-exclusive IntRange, braces
//#6 Explicit typing, Java-style iterable value, braces
//#7 Implicit typing, over string as collection, braces
