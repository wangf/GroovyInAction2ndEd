package com.manning.groovyinaction

import java.util.logging.Level

class LoggingCalculatorTest extends GroovyLogTestCase {
    static final MIXED_NUMBERS = [99, 2, 1, 0, -1, -2, -99]        //#A
    private calc

    void setUp() {
        calc = new LoggingCalculator()
    }

    void testCalculatorAndLog() {
        def log = stringLog(Level.FINER, 'LoggingCalculator') {   //#B
            def count = calc.countHowManyBiggerThan(MIXED_NUMBERS, -1)               //#C
            assertEquals(4, count)                                //#D
        }
        checkLogCount(1, "was equal", log)
        checkLogCount(4, "was bigger", log)
        checkLogCount(2, "was smaller", log)
        checkLogCount(4, /[^d][^o][^n][^'][^t] count this one/, log)
        checkLogCount(3, "don't count this one", log)
    }

    private checkLogCount(expectedCount, regex, log) {          //#E
        def matcher = (log=~regex)
        assertTrue log, expectedCount == matcher.count
    }
}
