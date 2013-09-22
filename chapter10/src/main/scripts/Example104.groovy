import groovy.transform.TypeChecked

class Person {
    String firstName
    String lastName

    @TypeChecked
    String getFullName() { "$firstName $lastName" }
}
