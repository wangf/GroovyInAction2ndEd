import java.util.concurrent.locks.ReentrantReadWriteLock
/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.17
 */
class Person {
    private final phoneNumbers = [:]
    final private lock = new ReentrantReadWriteLock()

    def getPhoneNumber(key) {
        lock.readLock.acquire()
        try {
            phoneNumbers[key]
        } finally {
            lock.readLock.release()
        }
    }

    def addPhoneNumber(key, value) {
        lock.writeLock.acquire()
        try {
            phoneNumbers[key] = value
        } finally {
            lock.writeLock.release()
        }
    }
}

