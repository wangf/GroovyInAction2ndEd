/**
 * Chapter 06
 * Section 6.2.2
 * Listing 6.4
 */

def result = (1 == 1) ? 'ok' : 'failed'
assert result == 'ok'
result = 'some string' ? 10 : ['x']
assert result == 10

