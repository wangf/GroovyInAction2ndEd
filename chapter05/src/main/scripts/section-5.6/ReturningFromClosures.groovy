/**
 * Chapter 05
 * Section 5.6
 */

[1, 2, 3].collect { it * 2 }

[1, 2, 3].collect { return it * 2 }

//A premature return can be used to, for example, double only the even entries:
[1, 2, 3].collect {
    if (it % 2 == 0) return it * 2
    return it
}
