import groovy.transform.WithReadLock
import groovy.transform.WithWriteLock

class PhoneBook3 {
    private final phoneNumbers = dummyNums()         //#A

    private dummyNums() {
        (1..8).collectEntries {
            ['Number' + it, '765432' + it]
        }
    }

    @WithReadLock
    def getNumber(key) {
        println "Reading started for $key"
        phoneNumbers[key]
        sleep 80
        println "Reading done for $key"
    }

    @WithWriteLock
    def addNumber(key, value) {
        println "Writing started for $key"
        phoneNumbers[key] = value
        sleep 100
        println "Writing done for $key"
    }
}

def p3 = new PhoneBook3()

(3..4).each { count ->
    Thread.start {                                    //#B
        sleep 100 * count
        p3.addNumber('Number' + count, '9876543')
    }
}
(2..6).collect { count ->
    Thread.start {                                    //#C
        sleep 100 * count
        p3.getNumber('Number' + count)
    }
}*.join()
//#A Fill phonebook with dummy numbers
//#B Start some writer threads
//#C Start some interleaved reader threads
