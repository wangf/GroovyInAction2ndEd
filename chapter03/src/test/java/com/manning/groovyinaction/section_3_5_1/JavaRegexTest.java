package com.manning.groovyinaction.section_3_5_1;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-06-24
 */
public class JavaRegexTest {
    private static final Logger logger = LoggerFactory.getLogger(JavaRegexTest.class);
    public static final String MY_STRING = "a\\b";
    
    
    @Test
    public void verifyStringRegexMore() {
        final String aSlashB="a\\\\b";
        logger.debug("Here is the result of a slash slash slash slash b '{}'", aSlashB);
        logger.debug("Does it Match '{}'", MY_STRING.matches(aSlashB));
    }
}
