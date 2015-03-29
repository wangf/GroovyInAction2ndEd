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

class Owl implements Polite {
    void greet() { hoot() }

    void thank() { hoot() }

    void hoot() { println 'Hoot' }
}

@TypeChecked
void main() {
    def list = [new Person(name: 'Bill'), new Owl()]              //#A
    Polite p1 = list[0]                                           //#B
    Polite o1 = list[1]                                           //#B
    Owl o2 = list[0]                                           //#1
    Person p2 = list[1]                                           //#2
}

main()

//#A Create list with Person and Owl
//#B Assign either element to variable of type Polite
//#1 Try to assign first element to Owl
//#2 Try to assign second element to Person
