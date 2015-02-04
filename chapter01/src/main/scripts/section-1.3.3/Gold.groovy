/**
 * Chapter 01 
 * Section 1.3.1
 * Listing 1.1
 * 04-Feb-2015
 */


List fibo = [1, 1]                          //#A
List gold = [1, 2]                          //#B

while (!isGolden(gold[-1])) {          //#C
    fibo.add(fibo[-1] + fibo[-2])         //#D
    gold.add(fibo[-1] / fibo[-2])         //#E
}

println "found golden ratio with fibo(${fibo.size - 1}) as"
println fibo[-1] + " / " + fibo[-2] + " = " + gold[-1]
println "_" * 10 + "|" + "_" * (10 * gold[-1])

def isGolden(candidate) {                   //#F
    def small = 1                           //#G
    def big = small * candidate             //#H
    return isCloseEnough((small + big) / big, big / small)
}
def isCloseEnough(a,b) { return (a-b).abs() < 1.0e-9 }