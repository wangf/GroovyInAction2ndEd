/**
 * Chapter 03
 * Section 3.5
 * 01-Feb-2015
 */
assert 'some text'.matches('some text')
assert 'some     text'.matches( 'some\\s+text')

def title ='^\\d+(\\.\\d+)? (.*)'
assert '1.22 abcde'.matches(title)
assert !'1. abcde'.matches(title)
assert '1.0   eeeee'.matches(title)
assert '1.0   g'.matches(title)
assert '9   '.matches(title)
assert !'9'.matches(title)

def date= '\\d\\d/\\d\\d/\\d\\d\\d\\d'

assert '12/12/2112'.matches(date)
assert !'9/12/2112'.matches(date)
assert !'09/2/2112'.matches(date)
assert !'09/02/12'.matches(date)
println "a\\b"
