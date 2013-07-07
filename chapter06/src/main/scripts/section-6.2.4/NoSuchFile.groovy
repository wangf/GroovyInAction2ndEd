/**
 * Chapter 06
 * Section 6.2.4
 */


input = new File('no such file')
assert  input.exists()
assert  input.canRead()
println input.text
