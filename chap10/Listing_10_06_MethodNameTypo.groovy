@groovy.transform.TypeChecked
class Person {
    String name

    String getFullName() { name.toUppercase() }        //#A
}
//#A Incorrect lowercase c
