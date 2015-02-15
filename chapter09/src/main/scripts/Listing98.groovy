/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */

import groovy.transform.Sortable

@Sortable(includes = 'last,initial')
//#1
class Politician {
    String first
    Character initial
    String last

    String initials() { first[0] + initial + last[0] }
}

def politicians = [
        new Politician(first: 'Margaret', initial: 'H', last: 'Thatcher'),
        new Politician(first: 'George', initial: 'W', last: 'Bush')
]

def sorted = politicians.toSorted()                    //#2
assert sorted*.initials() == ['GWB', 'MHT']
def byInitial = Politician.comparatorByInitial()       //#3
sorted = politicians.toSorted(byInitial)               //#4
assert sorted*.initials() == ['MHT', 'GWB']
