/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.transform.TypeChecked

interface Flying {
    void fly()
}

class Bird implements Flying {
    void fly() { println "I'm flying!" }
}

class Canary extends Bird {
    void sing() { println "Tweet!" }
}

@TypeChecked
void aviary() {
    def o = new Bird()
    o.fly()                        //#1
    o = new Canary()
    o.fly()                        //#2
    o.sing()                       //#2
}

aviary()
//#1 a bird can fly
//#2 a canary can fly too and also sing
