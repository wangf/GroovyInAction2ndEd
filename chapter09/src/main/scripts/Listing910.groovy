/**
 * Chapter 09
 * Section 9.2.2
 * Listing 9.10
 */

import groovy.transform.Canonical

@Canonical
class Inventor {
    String firstName, lastName
}

def i1 = new Inventor('Thomas', 'Edison')             //#A
def i2 = new Inventor('Thomas')
assert i1 != i2                                       //#B
assert i1.firstName == i2.firstName                   //#B
assert i1.toString() == 'Inventor(Thomas, Edison)'    //#C


