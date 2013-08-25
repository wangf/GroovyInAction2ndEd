package com.manning.groovyinaction

import groovy.transform.Canonical

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
@Canonical
class Circle implements Shape {

    def String color
    def Integer size

}
