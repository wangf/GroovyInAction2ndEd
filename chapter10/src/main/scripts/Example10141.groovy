import groovy.transform.TupleConstructor
import groovy.transform.TypeChecked

@TupleConstructor
class Person {
    String firstName
    String lastName
    int age
}

@TypeChecked
Person createPerson(List params) {
    Person p = params // compile-time error!
    p
}

createPerson(['Teddy', 'Riner', 24])

