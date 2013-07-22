import groovy.transform.ToString
/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.1
 */
@ToString
class Person {
    String first, last
}

def p = new Person(first: 'John', last: 'Doe')
assert p.toString() == 'Person(John, Doe)'
