import groovy.transform.TypeChecked

void validate(User u, Closure<Boolean> rule) {
    if (!rule.call(u)) {
        println "User $u.name $u.password rejected"
    }
}

@TypeChecked
void validateAll(user) {                           //#A
    validate(user) { !it.name.isEmpty() }            //#B
    validate(user) { it.password.size() > 7 }        //#C
}

def bob = new User(name: 'Bob', password: 'secr3t')
validateAll(bob)

//#A Error: type of user is Object
//#B Error: no property name for Object
//#C Error: no property password for Object
