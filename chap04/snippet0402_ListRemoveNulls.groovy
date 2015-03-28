// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def x = [1, null, 1]
assert [1, 1] == x.findAll { it != null }
assert [1, 1] == x.grep { it }
