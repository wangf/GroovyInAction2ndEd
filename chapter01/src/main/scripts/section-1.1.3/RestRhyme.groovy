/**
 * Chapter 01 
 * Section 1.1.3
 * Approximate Page 11 
 */

def text = "http://azarask.in/services/rhyme/?q=movie".toURL().text
println " The Text is '$text'"
for (rhyme in evaluate(text)) println rhyme
