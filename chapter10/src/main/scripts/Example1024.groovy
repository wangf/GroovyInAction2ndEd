import groovy.transform.TypeChecked

interface Polite {
    void greet()

    void thank()
}

class Person implements Polite {
    String name

    void greet() { println "Hello, I'm $name!" }

    void thank() { println 'Thanks!' }
}

class Duck implements Polite {
    void greet() { quack() }

    void thank() { quack() }

    void quack() { println 'Quack' }
}

@TypeChecked
void leastUpperBound() {
    def p = new Person(name: 'Bill')
    def d = new Duck()
    def list = [p, d] //# 1
    Polite p1 = list[0] //# 2
    Polite d1 = list[1] //# 3
    Duck p2 = list[0] //# 4
    Person d2 = list[1] //# 5
}
