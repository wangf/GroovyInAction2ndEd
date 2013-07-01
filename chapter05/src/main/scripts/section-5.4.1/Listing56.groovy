/**
 * Chapter 05
 * Listing 5.4
 */
def benchmark(repeat, Closure worker) {   //#1
    start = System.currentTimeMillis()   //#2
    repeat.times { worker(it) }             //#3
    stop = System.currentTimeMillis()     //#4
    return stop - start                   //#4
}

slow = benchmark(10000) { (int) it / 2 }  //#5
fast = benchmark(10000) { it.intdiv(2) }  //#5
assert fast * 15 < slow                   //#5 


