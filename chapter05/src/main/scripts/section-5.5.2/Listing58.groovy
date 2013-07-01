/**
 * Chapter 05
 * Section 5.5.2
 * Listing 5.8
 */

class Mother {
    int field = 1
    int foo(){
        return 2
    }
    Closure birth (param) {                    //#1
        def local = 3
        def closure = { caller ->
            [this, field, foo(), local, param, caller, owner]
        }
        return closure
    }
}

Mother julia = new Mother()

closure = julia.birth(4)                      //#2

context = closure.call(this)                  //#3
println context[0].class.name                 //#4

assert context[1..4] == [1,2,3,4]             //#5
assert context[5] instanceof Script           //#6
assert context[6] instanceof Mother           //#7

firstClosure  = julia.birth(4)                  //#8 
secondClosure = julia.birth(4)                  //#8 
assert false == firstClosure.is(secondClosure)  //#8 
