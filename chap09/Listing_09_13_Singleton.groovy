import static groovy.test.GroovyAssert.shouldFail

@Singleton class Zeus { }

assert Zeus.instance
def ex = shouldFail(RuntimeException) { new Zeus() }
println ex.message
