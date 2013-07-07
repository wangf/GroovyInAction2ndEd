/**
 * Chapter 06
 * Section 6.2.4
 */



input = new File('no such file')
assert input.exists(), "cannot find '$input.name'"
assert input.canRead(), "cannot read '$input.canonicalPath'"
println input.text
