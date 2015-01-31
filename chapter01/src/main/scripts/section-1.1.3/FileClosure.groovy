/**
 * Chapter 01
 * Section 1.1.3
 * Approximate Page 9
 * 31-Jan-2015
 */

def number = 0
new File('data.txt').eachLine { line ->
    number++
    println "$number: $line"
}
