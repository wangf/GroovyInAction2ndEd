package com.manning.groovyinaction

class DebugBuilder extends BuilderSupport {
    def result = '' << ''                         //#1
    def indent = ' ' * 4
    int indentCount = -1

    def createNode(name) {                       //#2
        indentCount++
        return check(name)
    }

    def createNode(name, value) {
        return check(createNode(name) << format(value))
    }

    def createNode(name, Map attributes) {
        return check(createNode(name) << format(attributes))
    }

    def createNode(name, Map attributes, value) {
        return check(createNode(name, attributes) << format(value))
    }

    void setParent(parent, child) {
        result << "\n" << indent * indentCount << child.toString()
    }

    void nodeCompleted(parent, node) {
        indentCount--
    }

    private check(descr) {                      //#3
        if (!current) result << descr
        return descr
    }

    private format(value) {
        return '(' << value.toString() << ')'
    }

    private format(Map attributes) {
        StringBuffer formatted = '' << '['
        attributes.each { key, value ->
            formatted << key << ':' << value << ', '
        }
        formatted.length = formatted.size() - 2
        formatted << ']'
        return formatted
    }
}

def builder = new DebugBuilder()
builder.foo() {
    bar()
    baz('x') { map(a: 1) }
}
assert "\n" + builder.result == '''
foo
    bar
    baz(x)
        map[a:1]'''
