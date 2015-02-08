/**
 * Chapter 05
 * Listing 5.7
 *
 * 07-Feb-2015
 */

def mult = { x, y -> return x * y }
def twoTimes = mult.curry(2)
assert twoTimes(5) == 10

//def twoTimes = { y -> mult 2, y }
