// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def x = 'a'
assert ['x': 1] == [x: 1]
assert ['a': 1] == [(x): 1]
