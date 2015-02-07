/**
 * Chapter 04
 * Section 4.2.3
 *
 * 07-Feb-2015
 */

def x = [1, 1, 1]
assert [1] == new HashSet(x).toList()
assert [1] == x.unique()

