/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import static groovy.test.GroovyAssert.shouldFail

void alsoOneDimensional() {
    java.awt.Dimension d = [100]              //#A
}

shouldFail(ClassCastException) {
    alsoOneDimensional()
}
