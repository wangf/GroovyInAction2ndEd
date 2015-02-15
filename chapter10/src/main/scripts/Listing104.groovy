/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */

import groovy.transform.TypeChecked

class Actor {
    String firstName, lastName

    @TypeChecked
    //#1
    String getFullName() { "$firstName $lastName" }

    void makePeace() {
        new AntBuilder().echo('Peace was never an option')    //#2
    }
}

def magneto = new Actor(firstName: 'Ian', lastName: 'McKellen')
assert magneto.fullName == 'Ian McKellen'
magneto.makePeace()
//#1 Checked
//#2 Dynamic features allowed
