import groovy.transform.Immutable

/**
 * Chapter 09
 * Section 9.2.2
 * Listing 9.11
 */
@Immutable
class Person {
    String firstName, lastName
}

new Person(firstName: 'Dierk', lastName: 'Koenig')
def p = new Person('Hamlet', "D'Arcy")
assert p.firstName == 'Hamlet'

try {
    p.firstName = 'John'
} catch (ReadOnlyPropertyException e) {
    println e.localizedMessage
} 



