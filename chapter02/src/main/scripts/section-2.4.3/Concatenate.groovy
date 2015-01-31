/**
 * Chapter 02
 * Section 2.4.3
 * 31-Jan-2015
 */

def code = '1 + '
code += System.getProperty('java.class.version')
assert code == '1 + 51.0'
assert 52.0 == evaluate(code)
