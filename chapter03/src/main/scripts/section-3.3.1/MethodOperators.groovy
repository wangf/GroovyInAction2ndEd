/**
 * Chapter 03
 * Section 3.3.1
 */

def a = 1
def b = 2
def c = 3

assert a + b == a.plus(b)

assert a - b == a.minus(b)

assert a * b == a.multiply(b)

assert a / b == a.div(b)
assert a % b == a.mod(b)



//TODO
//assert a++ == a.next()
//TODO
//assert ++a == a.next()
//TODO
//assert a  == a.previous()
//TODO - Missing method exception
//assert -a == a.negative()
//TODO
//assert (+a) == a.positive()
assert a ** b == a.power(b)
//TODO
//assert a | b == a.or(b)
//TODO
//assert a & b == a.and(b)
//TODO
//assert a ^ b == a.xor(b)
//TODO
//assert ~a == a.bitwiseNegate()
//assert a[b] == a.getAt(b)
//assert (a[b] = c) == a.putAt(b, c)

assert a << b == a.leftShift(b)
assert a >> b == a.rightShift(b)
assert a >>> b == a.rightShiftUnsigned(b)
//TODO
//assert ( switch (a) { case b: } ) == b.isCase (a)

assert a in b == b.isCase(a)
//TODO
//assert (a == b) == ( if a implements Comparable then a.compareTo (b) == 0 else a.equals (b))
//assert a != b == !a == b
assert a <=> b == a.compareTo(b)
assert a > b == a.compareTo(b) > 0
assert a >= b == a.compareTo(b) >= 0
assert a < b == a.compareTo(b) < 0
assert a <= b == a.compareTo(b) <= 0
assert a as Integer == a.asType(Integer) 
