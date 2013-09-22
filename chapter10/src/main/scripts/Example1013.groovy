class Person {
    String firstName
    String lastName
    int age
}

Person ok = [firstName: 'Teddy', lastName: 'Riner', age: 24]
Person bad = [firstName: 'Teddy', lastName: 'Riner', age: '24']
