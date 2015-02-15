import groovy.transform.Synchronized
/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.17
 */
class PhoneBook1 {
    private final phoneNumbers = [:]

    @Synchronized
    def getNumber(key) {
        phoneNumbers[key]
    }

    @Synchronized
    void addNumber(key, value) {
        phoneNumbers[key] = value
    }
}

def p1 = new PhoneBook1()
(0..99).collect { num ->
    Thread.start {
        p1.addNumber('Number' + num, '98765' + num)   //#A
    }
}*.join()                                             //#B
assert p1.getNumber('Number43') == '9876543'          //#C
//#A Each thread adds a dummy phonebook entry
//#B Await completion of 99 parallel threads
//#C Check a sample number


