/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.transform.TypeChecked

class User {
    String name
    String password
}


void validate(User u, Closure<Boolean> rule) {
    if (!rule.call(u)) {
        println "User $u.name $u.password rejected"
    }
}

@TypeChecked
void validateAll(user) {                           //#1
    validate(user) { !it.name.isEmpty() }            //#2
    validate(user) { it.password.size() > 7 }        //#3
}

def bob = new User(name: 'Bob', password: 'secr3t')
validateAll(bob)
//#1 Error: type of user is Object
//#2 Error: no property name for Object
//#3 Error: no property password for Object
