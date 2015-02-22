def until(Closure condition, Closure closure) {
    while (!condition()) closure()      //#1
}

def counter = 0

until({ counter == 10 }) {             //#2
    counter++
}

assert counter == 10
