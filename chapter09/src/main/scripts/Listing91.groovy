import groovy.transform.ToString
/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.1
 */
@ToString
class Detective {
    String firstName, lastName
}

def sherlock = new Detective(firstName: 'Sherlock', lastName: 'Holmes')
assert sherlock.toString() == 'Detective(Sherlock, Holmes)'
