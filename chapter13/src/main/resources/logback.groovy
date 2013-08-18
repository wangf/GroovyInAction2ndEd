import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.TRACE

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%.-1level|%-40.40logger{0}|%msg%n"
    }
}

logger "com.manning.groovyinaction", DEBUG
logger "org.h2", TRACE
logger "groovy.sql", TRACE

root(DEBUG, ["STDOUT"])

