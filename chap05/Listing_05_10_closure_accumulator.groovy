// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def foo(n) {
    return { n += it }
}

def accumulator = foo(1)
assert accumulator(2) == 3
assert accumulator(1) == 4
