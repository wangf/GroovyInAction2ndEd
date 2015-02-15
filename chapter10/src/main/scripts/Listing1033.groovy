/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens ()
 * Create Date: 2/15/15
 */
import groovy.transform.TypeChecked

@TypeChecked
def flowTyping() {
    def var = 'A string'                            //#1
    var = var.toUpperCase()                         //#2
    var = var.length()                              //#3
    var = String.valueOf(var)                       //#4
    var = 2 * var                                     //#5
    var
}
//#1 Assign String to var
//#2 Assign another String to var
//#3 Assign int to var
//#4 Assign String to var
//#5 FAIL! Trying to call (int*String)
