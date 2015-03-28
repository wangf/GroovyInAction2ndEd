// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def myMethod() {
    throw new IllegalArgumentException()
}

def log = []
try {
    myMethod()
} catch (Exception e) {
    log << e.toString()
} finally {
    log << 'finally'
}
assert log.size() == 2


try {
    if (Math.random() < 0.5) 1 / 0
    else null.hashCode()
} catch (ArithmeticException | NullPointerException exception) {
    println exception.class.name
}
