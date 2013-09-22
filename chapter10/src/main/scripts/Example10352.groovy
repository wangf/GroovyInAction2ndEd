import groovy.transform.TypeChecked

class Person {
    String name
}

def with(@DelegatesTo.Target def p, @DelegatesTo Closure cl) {
    //# 1
    cl.delegate = p
    cl()
}

@TypeChecked
void typeCheckedCode() {
    def o = new Person(name: 'Bob')
    with(o) { println name } //# 2
    o = new Date()
    with(o) { println getTime() } //# 3
}

typeCheckedCode()
