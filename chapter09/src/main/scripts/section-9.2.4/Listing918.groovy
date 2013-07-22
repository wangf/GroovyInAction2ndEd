import groovy.transform.WithReadLock
import groovy.transform.WithWriteLock
/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.18
 */
class Person {
    private final phoneNumbers = [:]

    @WithReadLock
    def getPhoneNumber(key) {
        phoneNumbers[key]
    }

    @WithWriteLock
    def addPhoneNumber(key, value) {
        phoneNumbers[key] = value
    }
}


