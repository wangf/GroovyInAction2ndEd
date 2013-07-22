import groovy.transform.Synchronized
/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.15
 */
class Person {
    private final phoneNumbers = [:]

    @Synchronized
    def getPhoneNumber(key) {
        phoneNumbers[key]
    }

    @Synchronized
    def addPhoneNumber(key, value) {
        phoneNumbers[key] = value
    }
}




