import groovy.transform.TypeChecked
import groovy.transform.stc.ClosureParams
import groovy.transform.stc.FirstParam

void validate(User u,                                               //#A
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

//#A First parameter to validate method is of type User
//#1 Type hint FirstParam refers to User type
