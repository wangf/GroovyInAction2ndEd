import groovy.transform.EqualsAndHashCode

/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.3
 */
@EqualsAndHashCode
class Actor {
    String firstName, lastName
}

def magneto = new Actor(firstName: 'Ian', lastName: 'McKellen')
def gandalf = new Actor(firstName: 'Ian', lastName: 'McKellen')
assert magneto == gandalf
