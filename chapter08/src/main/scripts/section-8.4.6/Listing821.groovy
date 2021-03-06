/**
 * Chapter 08
 * Section 8.4.6
 * Listing 8.21
 */

class EvenSieve {
    def getNo2() {
        removeAll { it % 2 == 0 }
        return this
    }
}

class MinusSieve {
    def minus(int num) {
        removeAll { it % num == 0 }
        return this
    }
}

List.mixin EvenSieve, MinusSieve

assert (0..10).toList().no2 - 3 - 5 == [1, 7]

