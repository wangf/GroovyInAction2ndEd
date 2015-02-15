/**
 * Chapter 09
 * Section 9.2.2
 * Listing 9.9
 */

import groovy.transform.builder.Builder

@Builder
class Chemist {
    String first
    String last
    int born
}

def builder = Chemist.builder()                                 //#1
def c = builder.first("Marie").last("Curie").born(1867).build() //#2
assert c.first == "Marie"
assert c.last == "Curie"
assert c.born == 1867

