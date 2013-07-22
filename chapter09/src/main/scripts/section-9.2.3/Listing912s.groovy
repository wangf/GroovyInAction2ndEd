import groovy.util.logging.Slf4j
/**
 * Chapter 09
 * Section 9.2.3
 * Listing 9.12
 */
@Slf4j
class Person {
    def method() {
        log.debug("Hello Logback")
    }
}

new Person().method()



