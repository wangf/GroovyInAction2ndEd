/**
 * Chapter 05
 * Listing 5.2
 */
class MethodClosureSample {
    int limit

    MethodClosureSample(int limit) {
        this.limit = limit
    }

    boolean validate(String value) {
        return value.length() <= limit
    }
}


MethodClosureSample first = new MethodClosureSample(6)   //#1
MethodClosureSample second = new MethodClosureSample(5)  //#1

Closure firstClosure = first.&validate                      //#2

def words = ['long string', 'medium', 'short', 'tiny']

assert 'medium' == words.find(firstClosure)                 //#3
assert 'short' == words.find(second.&validate)              
