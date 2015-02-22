import groovy.transform.*

interface Term {}

@Canonical
class Value implements Term {
    def content
}

@Canonical
class Add implements Term {
    def left, right
}

@Canonical
class Mult implements Term {
    def left, right
}
