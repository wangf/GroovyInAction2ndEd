/**
 * Chapter 08
 * Section 8.4.4
 * Listing 8.15
 */

Integer.metaClass.static.answer = {-> 42}

assert Integer.answer() == 42
