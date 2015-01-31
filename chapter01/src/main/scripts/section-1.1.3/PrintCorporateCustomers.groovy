/**
 * Chapter 01 
 * Section 1.1.3
 * Approximate Page 11
 * 31-Jan-2015
 */

def customers = new XmlSlurper().parse(new File('customers.xml'))
for (customer in customers.corporate.customer) {
    println "${customer.@name} works for ${customer.@company}"
}
