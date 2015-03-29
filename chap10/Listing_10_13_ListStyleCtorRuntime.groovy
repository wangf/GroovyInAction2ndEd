import static groovy.test.GroovyAssert.shouldFail

void alsoOneDimensional() {
    java.awt.Dimension d = [100]              //#A
}

shouldFail(ClassCastException) {
    alsoOneDimensional()
}

//#A Two parameters required! Runtime error here!
