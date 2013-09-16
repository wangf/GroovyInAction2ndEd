package contacts

class Person {
    String name
    String email

    static constraints = {
        name(blank: false)
        email(email: true)
    }
} 
