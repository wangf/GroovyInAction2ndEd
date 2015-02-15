import groovy.transform.TupleConstructor
/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.4
 */
@TupleConstructor
class Athlete {
    String firstName, lastName
}
def a1 = new Athlete('Michael', 'Jordan')
def a2 = new Athlete('Michael')
assert a1.firstName == a2.firstName
