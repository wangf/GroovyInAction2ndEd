/**
 * Chapter 09
 * Section 9.2.2
 * Listing 9.7
 */
class Zeus {
    static final Zeus instance = new Zeus()

    private Zeus() {}
}

assert Zeus.instance


