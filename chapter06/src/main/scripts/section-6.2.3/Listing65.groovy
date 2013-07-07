/**
 * Chapter 06
 * Section 6.2.3
 * Listing 6.5
 */

def a = 1
def log = ''
switch (a) {
    case 0: log += '0' //# A
    case 1: log += '1' //# A
    case 2: log += '2'; break
    default: log += 'default'
}
assert log == '12'


