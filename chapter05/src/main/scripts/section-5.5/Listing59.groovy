/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */

class Mother {
    def prop = 'prop'

    def method() { 'method' }

    Closure birth(param) {                              //#1
        def local = 'local'
        def closure = {
            [this, prop, method(), local, param]
        }
        return closure
    }
}

Mother julia = new Mother()
def closure = julia.birth('param')                    //#2

def context = closure.call()                          //#3

assert context[0] == julia                          //#4
assert context[1, 2] == ['prop', 'method']            //#5
assert context[3, 4] == ['local', 'param']            //#6

assert closure.thisObject == julia                     //|#7
assert closure.owner == julia                     //|#7

assert closure.delegate == julia                     //|#8
assert closure.resolveStrategy == Closure.OWNER_FIRST  //|#8
