/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.transform.TypeChecked

@TypeChecked
void leastUpperBoundOnConditional() {
    def o = new Date()                                //#1
    if (Math.random()) {                              //#A
        o = 'Hello'                                   //#2
    }
    o.time                                            //#B
}
//#1 Variable initialized with Date
//#A Random condition
//#2 Assign a String
//#B Try to call o.time
