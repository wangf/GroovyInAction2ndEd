// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def x = [1, 1, 1]
assert [1] == new HashSet(x).toList()
assert [1] == x.unique()
//extra
assert [1] == [1, '1'].unique { item -> item.toInteger() }