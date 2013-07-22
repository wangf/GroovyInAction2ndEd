import groovy.transform.InheritConstructors

/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.6
 */
@InheritConstructors
class MyPrintWriter extends PrintWriter {}

assert new MyPrintWriter(new File('out.txt'))

