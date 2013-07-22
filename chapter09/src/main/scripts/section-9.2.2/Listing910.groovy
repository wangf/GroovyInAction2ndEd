/**
 * Chapter 09
 * Section 9.2.2
 * Listing 9.10
 */
@Singleton
class Zeus {
}

assert Zeus.instance
try {
    new Zeus()
}
catch (RuntimeException e) {
    println e.localizedMessage
}


