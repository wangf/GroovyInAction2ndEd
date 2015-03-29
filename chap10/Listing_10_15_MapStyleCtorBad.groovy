import groovy.transform.TypeChecked

class Athlete {
    String first, last
    int age
}

@TypeChecked
void ageInteger() {
    Athlete ok = [first: 'Michael', last: 'Jordan', age: 52]          //#1
}

@TypeChecked
void ageString() {
    Athlete bad = [first: 'Michael', last: 'Jordan', age: '52']       //#2
}

//#1 Passes
//#2 Fails
