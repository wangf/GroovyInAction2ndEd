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
    if (params.size() != 3) {
        throw new IllegalArgumentException('Incorrect number of arguments')
    }
    String firstName = params[0] // no need to cast as String on LHS
    String lastName = params[1] // no need to cast as String on LHS
    Integer age = (Integer) params[2] // cast required!
    Person p = [firstName, lastName, age] // now passes!
    p
}
