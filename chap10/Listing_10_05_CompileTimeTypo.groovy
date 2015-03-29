import groovy.transform.TypeChecked

@TypeChecked
class Sleuth {
    String firstName
    String lastName                                        //#A
    String getFullName() { "$firstName $lastname" }        //#B
}
//#A Uppercase N
//#B Incorrect lowercase n
