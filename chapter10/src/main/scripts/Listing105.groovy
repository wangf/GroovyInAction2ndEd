/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.transform.TypeChecked

@TypeChecked
class Sleuth {
    String firstName
    String lastName                                        //#A
    String getFullName() { "$firstName $lastname" }        //#B
}
//#A Uppercase N
//#B Incorrect lowercase n
