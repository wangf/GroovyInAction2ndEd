@groovy.transform.TypeChecked
class Repeat {
    static void repeat(int n, String message) {
        n.times { println message }
    }

    static void main(String... args) {
        repeat('Hello', 4)
    }
}
