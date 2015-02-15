/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.transform.WithReadLock
import groovy.transform.WithWriteLock

class PhoneBook3 {
    private final phoneNumbers = [:]

    @WithReadLock
    def getNumber(key) {
        phoneNumbers[key]
    }

    @WithWriteLock
    def addNumber(key, value) {
        phoneNumbers[key] = value
    }
}

