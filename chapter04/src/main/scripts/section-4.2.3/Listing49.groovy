/**
 * Chapter 04
 * Section 4.2.3
 * Listing 4.9
 */

def list = [1, 2, 3]

assert list.count(2) == 1              //#A
assert list.max() == 3                 //#A
assert list.min() == 1                 //#A

def even = list.find { item ->         //#A
    item % 2 == 0                      //#A
}                                      //#A
assert even == 2                       //#A

assert list.every { item -> item < 5 }  //#A
assert list.any { item -> item < 2 }  //#A

def store = ''
list.each { item ->         //#B
    store += item           //#B
}                           //#B
assert store == '123'       //#B

store = ''                  //#B
list.reverseEach { item ->   //#B
    store += item           //#B
}                           //#B
assert store == '321'       //#B

assert list.join('-') == '1-2-3'            //#C

result = list.inject(0) { clinks, guests ->  //#C
    clinks += guests                        //#C
}                                           //#C
assert result == 0 + 1 + 2 + 3              //#C
assert list.sum() == 6                      //#C

factorial = list.inject(1) { fac, item ->    //#C
    fac *= item                             //#C
}                                           //#C
assert factorial == 1 * 1 * 2 * 3               //#C 

