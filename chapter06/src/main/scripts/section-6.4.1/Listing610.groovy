/**
 * Chapter 06
 * Section 6.4.1
 * Listing 6.10
 */


def a = 1
while (true) {            //#A
    a++
    break                 //#B
}
assert a == 2

for (i in 0..10) {
    if (i == 0) continue   //#C
    a++
    if (i > 0) break      //#D
}
assert a == 3
