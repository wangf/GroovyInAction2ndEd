/**
 * Chapter 08
 * Section 8.3.2
 * Listing 8.4
 */

def propertyMissing(String name) {
    int result = 0
    name.each {
        result <<= 1
        if (it == 'I') result++
    }
    return result
}

assert IIOI +
        IOI ==
        I00I0

