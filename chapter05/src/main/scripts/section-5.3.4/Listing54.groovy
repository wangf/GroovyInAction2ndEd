/**
 * Chapter 05
 * Listing 5.4
 *
 * 07-Feb-2015
 */

Map map = ['a': 1, 'b': 2]
map.each { key, value -> map[key] = value * 2 }         //#1
assert map == ['a': 2, 'b': 4]

Closure doubler = { key, value -> map[key] = value * 2 }//#2
map.each(doubler)                                      //#2
assert map == ['a': 4, 'b': 8]

def doubleMethod(entry) {                              //#3
    entry.value = entry.value * 2                      //#3
}

doubler = this.&doubleMethod                           //#4
map.each(doubler)                                      //#4
assert map == ['a': 8, 'b': 16]
