/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import java.util.concurrent.locks.ReentrantReadWriteLock

class PhoneBook3 {
    private final phoneNumbers = [:]
    final private lock = new ReentrantReadWriteLock()

    def getNumber(key) {
        lock.readLock().lock()
        try {
            phoneNumbers[key]
        } finally {
            lock.readLock().unlock()
        }
    }

    def addNumber(key, value) {
        lock.writeLock().lock()
        try {
            phoneNumbers[key] = value
        } finally {
            lock.writeLock().unlock()
        }
    }
}
