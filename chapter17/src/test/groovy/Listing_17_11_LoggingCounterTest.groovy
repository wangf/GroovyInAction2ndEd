import org.slf4j.Logger

import java.util.logging.Level


class LoggingCounter {
    static final LOG = Logger.getLogger('LoggingCalculator')
    def countHowManyBiggerThan(items, target) {
        def count = 0
        items.each{
            if (it > target) {
                count++
                LOG.finer "item was bigger - count this one"
            } else if (it == target) {
                LOG.finer "item was equal - don't count this one"
            } else {
                LOG.finer "item was smaller - don't count this one"
            }
        }
        return count
    }
}


class Listing_17_11_LoggingCounterTest extends GroovyLogTestCase {
    static final MIXED_NUMBERS = [99, 2, 1, 0, -1, -2, -99]        //#A
    private count

    void setUp() {
        count = new LoggingCounter()
    }

    void testCounterAndLog() {
        def log = stringLog(Level.FINER, 'LoggingCounter') {         //#B
            def bigger = count.biggerThan(MIXED_NUMBERS, -1)           //#C
            assertEquals(4, bigger)                                    //#D
        }
        checkLogCount(1, "was equal", log)
        checkLogCount(4, "was bigger", log)
        checkLogCount(2, "was smaller", log)
        checkLogCount(4, /[^d][^o][^n][^'][^t] count this one/, log)
        checkLogCount(3, "don't count this one", log)
    }

    private checkLogCount(expectedCount, regex, log) {             //#E
        def matcher = (log =~ regex)
        assertTrue log, expectedCount == matcher.count
    }
}
