/**
 * Chapter 09
 * Section 9.2.6
 * Listing 9.22
 */
@groovy.transform.ConditionalInterrupt({ errorCount >= 10 })
import java.lang.Object

errorCount = 0

1000.times {
    try {
        // do some work
    } catch (Throwable t) {
        errorCount++
    }
}



