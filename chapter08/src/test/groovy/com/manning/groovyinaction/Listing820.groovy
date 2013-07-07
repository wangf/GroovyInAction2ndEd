package com.manning.groovyinaction
/**
 * Chapter 08
 * Section 8.4.6
 * Listing 8.20
 */

@Mixin(MessageFeature)
class FirstTest extends GroovyTestCase {
    void testWithMixinUsage() {
        message = "Called from Test"
        assertMessage "Called from Test"
    }
}

class MessageFeature {
    def message

    void assertMessage(String msg) {
        assertEquals msg, message
    }
}
