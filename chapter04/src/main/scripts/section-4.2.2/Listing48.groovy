/**
 * Chapter 04
 * Section 4.2.2
 * Listing 4.8
 *
 * 07-Feb-2015
 */

assert [1, [2, 3]].flatten() == [1, 2, 3]
assert [1, 2, 3].intersect([4, 3, 1]) == [3, 1]
assert [1, 2, 3].disjoint([4, 5, 6])

list = [1, 2, 3]
popped = list.pop()                                    //#1
assert popped == 3
assert list == [1, 2]

assert [1, 2].reverse() == [2, 1]
assert [3, 1, 2].sort() == [1, 2, 3]

def list = [[1, 0], [0, 1, 2]]
list = list.sort { a, b -> a[0] <=> b[0] }              //#2
assert list == [[0, 1, 2], [1, 0]]

list = list.sort { item -> item.size() }               //#3
assert list == [[1, 0], [0, 1, 2]]

list = ['a', 'b', 'c']
list.remove(2)                                         //#4
assert list == ['a', 'b']
list.remove('b')                                       //#5
assert list == ['a']

list = ['a', 'b', 'b', 'c']
list.removeAll(['b', 'c'])
assert list == ['a']

def doubled = [1, 2, 3].collect { item ->                 //#6
    item * 2
}
assert doubled == [2, 4, 6]

def odd = [1, 2, 3].findAll { item ->                     //#7
    item % 2 == 1
}
assert odd == [1, 3]
