/**
 * Chapter 01 
 * Section 1.3.1
 * Listing 1.1
 */


List fibo = [1, 1]            // list of fibonacci numbers
List gold = [1, 2]            // list of golden ratio candidates

while (!isGolden(gold[-1])) {    // last golden candidate 
    fibo.add(fibo[-1] + fibo[-2])    // next fibo number 
    gold.add(fibo[-1] / fibo[-2])    // next golden candidate
}

println "found golden ratio with fibo(${ fibo.size - 1 }) as"
println fibo[-1] + " / " + fibo[-2] + " = " + gold[-1]
println "_" * 10 + "|" + "_" * (10 * gold[-1])

def isGolden(candidate) {    // candidate satisfies golden rule 
    def small = 1        // smaller section
    def big = small * candidate    // bigger section
    return isCloseEnough((small + big) / big, big / small)
}

def isCloseEnough(a, b) { return (a - b).abs() < 1.0e-9 }
