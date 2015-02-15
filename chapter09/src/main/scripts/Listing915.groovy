import groovy.transform.TailRecursive

/**
 * Chapter 09
 * Section 9.2.4
 * Listing 9.15
 */
class ListUtil {
    static reverse(List list) {
        doReverse(list, [])
    }

    @TailRecursive
    private static doReverse(List todo, List done) {        //#A
        if (todo.isEmpty()) done
        else doReverse(todo.tail(), [todo.head()] + done)
    }
}

assert ListUtil.reverse(['a', 'b', 'c']) == ['c', 'b', 'a']




