/**
 * Chapter 09
 * Section 9.2.5
 * Listing 9.19
 */
class Person implements Cloneable {

    String firstName, lastName
    Date birthday

    protected Person(Person other) throws CloneNotSupportedException {
        first = other.first
        last = other.last
        birthday = other.birthday.clone()
    }

    @Override
    Object clone() throws CloneNotSupportedException {
        new Person(this)
    }
}


