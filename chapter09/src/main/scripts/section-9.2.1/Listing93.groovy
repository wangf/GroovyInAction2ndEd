import groovy.transform.TupleConstructor
/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.3
 */
@TupleConstructor
class Person {
    String first, last
}

def p1 = new Person('John', 'Doe')
def p2 = new Person('John')
