import groovy.transform.TypeChecked

@TypeChecked
class Person {
    String name

    String getFullName() { name.toUppercase() }
}
