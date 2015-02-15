/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
@groovy.transform.TypeChecked
class Repeat {
    static void repeat(int n, String message) {
        n.times { println message }
    }

    static void main(String... args) {
        repeat('Hello', 4)
    }
}
