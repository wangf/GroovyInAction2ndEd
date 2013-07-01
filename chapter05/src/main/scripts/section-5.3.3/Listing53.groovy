/**
 * Chapter 05
 * Listing 5.3
 */
class MultiMethodSample {

    int mysteryMethod (String value) {
        return value.length()
    }

    int mysteryMethod (List list) {
        return list.size()
    }

    int mysteryMethod (int x, int y) {
        return x+y
    }
}

MultiMethodSample instance = new MultiMethodSample()
Closure multi = instance.&mysteryMethod               //#1

assert 10 == multi ('string arg')              //#2
assert 3 == multi (['list', 'of', 'values'])   //#2
assert 14 == multi (6, 8)                      //#2
