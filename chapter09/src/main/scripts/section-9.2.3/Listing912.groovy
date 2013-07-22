import groovy.util.logging.Log
/**
 * Chapter 09
 * Section 9.2.3
 * Listing 9.12
 */
@Log
class Person {
    def method() {
        log.fine(runLongDatabaseQuery())
    }
}

new Person().method()



