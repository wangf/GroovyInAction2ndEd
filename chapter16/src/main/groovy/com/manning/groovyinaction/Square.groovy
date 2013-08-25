package com.manning.groovyinaction

import groovy.transform.Canonical
/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
@Canonical
class Square implements Shape {
    def Integer size
    def String color

    Square(Integer size) {
        setSize size 
    }
}
