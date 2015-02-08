/**
 * Chapter 05
 * Listing 5.5
 *
 * 07-Feb-2015
 */

def adder = { x, y -> return x + y }

assert adder(4, 3) == 7
assert adder.call(2, 6) == 8
