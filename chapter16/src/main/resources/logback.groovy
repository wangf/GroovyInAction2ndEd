import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%.-1level|%-30.30logger{0}|%msg%n"
    }
}

logger "com.manning.groovyinaction", DEBUG

root(DEBUG, ["STDOUT"])



