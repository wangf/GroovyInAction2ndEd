class Person {
    String firstName
    String lastName
    int age
}

def person = new Person(firstname: 'Peter', lastname: 'Jackson')
assert person.firstName == 'Peter'
