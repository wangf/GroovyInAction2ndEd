/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */

def numParams(Closure closure) {
    closure.getMaximumNumberOfParameters()
}

assert numParams { one -> } == 1
assert numParams { one, two -> } == 2

def paramTypes(Closure closure) {
    closure.getParameterTypes()
}

assert paramTypes { String s -> } == [String]
assert paramTypes { Number n, Date d -> } == [Number, Date]
