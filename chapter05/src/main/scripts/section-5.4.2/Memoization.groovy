/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */

def start = System.currentTimeMillis()

def fib
fib = { it < 2 ? 1 : fib(it-1) + fib(it-2) }
fib = fib.memoize()
assert fib(40) == 165_580_141

println "Time: ${System.currentTimeMillis() - start}"

//commenting out memoize = 18,071ms
//with memoize = 75ms
