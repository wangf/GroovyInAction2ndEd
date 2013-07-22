import groovy.transform.Canonical
/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.4
 */
@Canonical
class Person {
    String first, last
}

def p1 = new Person('John', 'Doe')
def p2 = new Person('John')
assert p1.first == p2.first
assert p1.toString() == 'Person(John, Doe)'

