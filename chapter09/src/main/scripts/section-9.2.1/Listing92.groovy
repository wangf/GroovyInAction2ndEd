import groovy.transform.EqualsAndHashCode

/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.2
 */
@EqualsAndHashCode
class Person {
    String first, last
}

def p1 = new Person(first: 'John', last: 'Doe')
def p2 = new Person(first: 'John', last: 'Doe')
assert p1 == p2
