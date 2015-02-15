/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens (m86014)
 * Create Date: 2/15/15
 */

import groovy.transform.TypeChecked
import groovy.transform.stc.ClosureParams
import groovy.transform.stc.FirstParam

class User {
    String name
    String password
}

void validate(User u,                                               //#2
              @ClosureParams(FirstParam) Closure<Boolean> rule) {   //#1
    if (!rule.call(u)) {
        println "User $u.name $u.password rejected"
    }
}

@TypeChecked
void validateAll(User user) {
    validate(user) { !it.name.isEmpty() }
    validate(user) { it.password.size() > 7 }
}

def bob = new User(name: 'Bob', password: 'secr3t')
validateAll(bob)
