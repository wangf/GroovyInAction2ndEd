package com.manning.groovyinaction

import groovy.util.logging.Slf4j

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
@Slf4j
class MaxAreaInfo implements ShapeInfo {

    @Override
    void displayInfo(Shape s1, Shape s2) {
        log.debug "Max Area Info for {} and {}", s1, s2
    }

    void setPrefix(final String prefix) {
        log.debug "Max Area Info Prefix {}", prefix
    }
}
