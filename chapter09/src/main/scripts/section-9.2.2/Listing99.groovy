/**
 * Chapter 09
 * Section 9.2.2
 * Listing 9.9
 */
class NoisySet implements Set {
    @Delegate
    Set delegate = new HashSet()

    @Override
    boolean add(i) {
        println "adding $i"
        delegate.add(i)
    }

    @Override
    boolean addAll(Collection i) {
        for (def x : i) {
            println "adding $x"
        }
        delegate.addAll(i)
    }
}

