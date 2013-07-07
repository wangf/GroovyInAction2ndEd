/**
 * Chapter 06
 * Section 6.3.1
 * Listing 6.8
 */

def list = [1, 2, 3]
while (list) {
    list.remove(0)
}
assert list == []

while (list.size() < 3) list << list.size() + 1
assert list == [1, 2, 3]

