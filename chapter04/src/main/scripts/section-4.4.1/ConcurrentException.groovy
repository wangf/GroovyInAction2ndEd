/**
 * Chapter 04
 * Section 4.4.1
 */


def list = [1, 2, 3, 4]
list.each { list.remove(0) }
// throws ConcurrentModificationException !!

