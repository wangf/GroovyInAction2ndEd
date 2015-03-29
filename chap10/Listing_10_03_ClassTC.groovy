import groovy.transform.TypeChecked

@TypeChecked
class Sleuth {
    String firstName
    String lastName

    String getFullName() { "$firstName $lastName" }
}

def nancy = new Sleuth(firstName: 'Nancy', lastName: 'Drew')
assert nancy.fullName == 'Nancy Drew'
