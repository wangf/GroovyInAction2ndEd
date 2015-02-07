/**
 * Chapter 03
 * Section 3.6.1
 * 01-Feb-2015
 */

assert 1f * 2f instanceof Double
assert (Byte) 1 + (Byte) 2 instanceof Integer
assert 1 * 2L instanceof Long
assert 1 / 2 instanceof BigDecimal
//assert 1/2  == BigDecimal (0.5)
assert (int) (1 / 2) instanceof Integer
assert 1.intdiv(2) instanceof Integer
assert Integer.MAX_VALUE + 1 instanceof Integer

println "${(2**31).class.name}"
println "${(2**33).class.name}"

//assert 2**31  instanceof Integer
//assert 2**33  instanceof Long
assert 2**3.5 instanceof Double
assert 2G + 1G instanceof BigInteger
assert 2.5G + 1G instanceof BigDecimal
//assert (1.5G==1.5F) instanceof  Boolean(true)
assert (1.5G == 1.5F) instanceof Boolean
println(1.5G == 1.5F) == true
println(1.1G == 1.1F) == false
