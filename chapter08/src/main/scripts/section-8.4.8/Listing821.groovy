/*
 * Copyright (c) 2015. Confidential, unpublished property of CIGNA.
 * Do not duplicate or distribute. Use and distribution limited solely to authorized personnel.
 */

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens (m86014)
 * Create Date: 2/14/15
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


