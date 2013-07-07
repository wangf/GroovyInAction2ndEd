/**
 * Chapter 08
 * Section 8.3.2
 * Listing 8.3
 */

class PropPretender {
    def propertyMissing(String name) {
        "accessed $name"
    }
}

def bounce = new PropPretender()
assert bounce.hello == 'accessed hello'
