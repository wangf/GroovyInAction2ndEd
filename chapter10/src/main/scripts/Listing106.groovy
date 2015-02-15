/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
@groovy.transform.TypeChecked
class Person {
    String name

    String getFullName() { name.toUppercase() }        //#A
}
//#A Incorrect lowercase c
