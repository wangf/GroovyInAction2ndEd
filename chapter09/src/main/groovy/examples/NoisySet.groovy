package examples

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
class NoisySet extends HashSet {
    @Override
    boolean add(item) {
        println "adding $item"
        super.add(item)
    }

    @Override
    boolean addAll(Collection items) {
        items.each { println "adding $it" }
        super.addAll(items)
    }
}
