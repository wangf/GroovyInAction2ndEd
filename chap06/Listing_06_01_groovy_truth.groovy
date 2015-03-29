

assert true            //#A
assert !false          //#A

assert ('a'=~/./)    //#B
assert !('a'=~/b/)   //#B

assert [1]             //#C
assert ![]             //#C

assert ['a': 1]         //#D
assert ![:]            //#D

assert 'a'             //#E
assert !''             //#E

assert 1               //#F
assert 1.1             //#F
assert 1.2f            //#F
assert 1.3g            //#F
assert 2L              //#F
assert 3G              //#F
assert !0              //#F

assert new Object()    //#G
assert !null           //#G

//#A Boolean values are trivial
//#B Matchers must match
//#C Collections must be nonempty
//#D Iterators must have next element
//#E Maps must be nonempty
//#F Strings must be nonempty
//#G Numbers (any type) must be nonzero
//#H Objects must be non-null
//#I Custom truth
//#J Calls asBoolean()
