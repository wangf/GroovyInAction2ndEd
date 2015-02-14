/**
 * Chapter 08
 * Section 8.3.1
 * Listing 8.1
 */

class Pretender {
    def methodMissing(String name, Object args) {
        "called $name with $args"
    }
}

def bounce = new Pretender()
assert bounce.hello('world') == 'called hello with [world]'



