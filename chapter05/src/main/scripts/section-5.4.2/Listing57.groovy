/**
 * Chapter 05
 * Listing 5.7
 */
def adder = {x, y -> return x+y}
def addOne = adder.curry(1)
assert addOne(5) == 6
