import groovy.transform.TypeChecked

interface Flying {
    void fly()
}

interface Quacking {
    void quack()
}

class Bird implements Flying {
    void fly() { println "I'm flying!" }
}

class Duck extends Bird {
    void quack() { println "Quack!" }
}

@TypeChecked
void birdsAndDucks() {
    def o = new Bird()
    o.fly()            //#1
    o = new Duck()
    o.fly()            //#2
    o.quack()            //#3
}
