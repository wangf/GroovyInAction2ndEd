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
void validateAll(User user) {                           //#A
    validate(user) { User u -> !u.name.isEmpty() }        //#A
    validate(user) { User u -> u.password.size() > 7 }    //#A
}

def bob = new User(name: 'Bob', password: 'secr3t')
validateAll(bob)
//#A User type in method and closure declarations
