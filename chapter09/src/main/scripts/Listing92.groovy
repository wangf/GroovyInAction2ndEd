import groovy.transform.ToString

/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.2
 */
@ToString(includeNames = true, ignoreNulls = true)
class Sleuth {
    String firstName, lastName
}

def nancy = new Sleuth(firstName: 'Nancy', lastName: 'Drew')
assert nancy.toString() == 'Sleuth(firstName:Nancy, lastName:Drew)'
nancy.lastName = null
assert nancy.toString() == 'Sleuth(firstName:Nancy)'
