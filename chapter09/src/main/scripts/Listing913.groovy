import static groovy.test.GroovyAssert.shouldFail

/**
 * Chapter 09
 * Section 9.2.3
 * Listing 9.13
 */
@Singleton
class Zeus {}

assert Zeus.instance
def ex = shouldFail(RuntimeException) { new Zeus() }
println ex.localizedMessage

