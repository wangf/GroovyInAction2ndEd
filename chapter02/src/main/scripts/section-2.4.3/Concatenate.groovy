/**
 * Chapter 02
 * Section 2.4.3
 */
println System.getProperty('java.class.version')

def code = '1 + '
code += System.getProperty('java.class.version')

assert code == '1 + 52.0'
assert 53.0 == evaluate(code) 


