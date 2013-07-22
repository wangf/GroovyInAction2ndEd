import groovy.transform.Synchronized
import groovy.util.logging.Slf4j
/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.16
 */
@Slf4j
class Person {
    private final phoneNumbers = [:]
    private final lock = new Object[0]

    @Synchronized('lock')
    def getPhoneNumber(key) {
        phoneNumbers[key]
    }

    def addPhoneNumber(key, value) {
        log.info("Adding phone number $value")
        synchronized (lock) {
            phoneNumbers[key] = value
        }
    }
}


