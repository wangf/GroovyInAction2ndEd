/**
 * Chapter 03
 * Section 3.6.2
 * 01-Feb-2015
 */

def store = ''
10.times{                                              //#A
    store += 'x'
}
assert store == 'xxxxxxxxxx'

store = ''
1.upto(5) { number ->                                  //#B
    store += number
}
assert store == '12345'

store = ''
2.downto(-2) { number ->                               //#C
    store += number + ' '
}
assert store == '2 1 0 -1 -2 '

store = ''
0.step(0.5, 0.1 ){ number ->                           //#D
    store += number + ' '
}
assert store == '0 0.1 0.2 0.3 0.4 '
