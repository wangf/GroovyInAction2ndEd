package com.manning.groovyinaction

import java.util.logging.Logger

class LoggingCalculator {
    static final LOG = Logger.getLogger('LoggingCalculator')

    def countHowManyBiggerThan(items, target) {
        def count = 0
        items.each {
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
