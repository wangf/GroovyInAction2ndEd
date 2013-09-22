def sum1(int x, int y) { x + y }        //#1
def sum2 = { int x, int y -> x + y }    //#2
assert sum1(3, 4) == 7
assert sum2(4, 5) == 9
