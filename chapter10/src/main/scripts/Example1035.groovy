import groovy.transform.TypeChecked

class Person {
    String name
}

def withPerson(Person p, @DelegatesTo(Person) Closure cl) {
    //# 1
    cl.delegate = p
    cl()
}

@TypeChecked //# 2

void typeCheckedCode() {
    def p = new Person(name: 'Bob')
    withPerson(p) { println name } //# 3
}

typeCheckedCode()
