def when(boolean condition, Closure block) {
    if (condition) block()
}

def a = 1
def b = 2

when(a < b, { println "a < b" })        //#1
