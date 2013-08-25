package com.manning.groovyinaction

import groovy.util.logging.Slf4j

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
@Slf4j
class MaxPerimeterInfo implements ShapeInfo {

    @Override
    void displayInfo(Shape s1, Shape s2) {
        log.debug "Shape Info for $s1 and $s2"
    }
}
