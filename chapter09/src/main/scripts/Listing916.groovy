import groovy.util.logging.Log

/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.16
 */
@Log
class Database {
    def search() {
        log.fine(runLongDatabaseQuery())
    }

    def runLongDatabaseQuery() {
        println 'Calling database'
        /* ... */
        return 'query result'
    }
}

new Database().search()



