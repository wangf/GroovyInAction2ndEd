import groovy.transform.TypeChecked

@TypeChecked
class Repeat {
    static void repeat(int n, String message) {
        for (int i = 0; i < n; i++) {
            println message
        }
    }

    static void main(String... args) {
        repeat('Hello', 4)
    }
}
