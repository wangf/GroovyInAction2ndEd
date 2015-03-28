// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def adder = { x, y -> return x + y }

assert adder(4, 3) == 7
assert adder.call(2, 6) == 8
