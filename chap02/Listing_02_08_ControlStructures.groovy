// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

if (false) assert false    //'if' as one-liner

if (null)                  //Null is false
{                          //Blocks may start on new line
    assert false
} else {
    assert true
}
def i = 0                 //Classic 'while'
while (i < 10) {
    i++
}
assert i == 10

def clinks = 0            //'for' in 'range'
for (remainingGuests in 0..9) {
    clinks += remainingGuests
}
assert clinks == (10 * 9) / 2

def list = [0, 1, 2, 3]   //'for' in 'list'
for (j in list) {
    assert j == list[j]
}

list.each() { item ->     //'each' method with a closure
    assert item == list[item]
}

switch (3) {              //Classic 'switch'
    case 1: assert false; break
    case 3: assert true; break
    default: assert false
}

//#A The if as one-liner
//#B Null is false
//#C Blocks may start on new line
//#D Classic while
//#E The for in range
//#F The for in list
//#G The each method with a closure
//#H Class switch
