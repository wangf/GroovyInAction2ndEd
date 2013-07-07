/**
 * Chapter 06
 * Section 6.4.2
 * Listing 6.11
 */

def myMethod() {
    throw new IllegalArgumentException()
}

def log = []
try {
    myMethod()
} catch (Exception e) {
    log << e.toString()
} finally {
    log << 'finally'
}
assert log.size() == 2
