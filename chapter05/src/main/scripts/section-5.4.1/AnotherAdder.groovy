/**
 * Chapter 05
 * Section 5.4.1
 */

def adder = { x, y = 5 -> return x + y }

assert adder(4, 3) == 7
assert adder.call(7) == 12
