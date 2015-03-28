// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def customers = new XmlSlurper().parse(new File('customers.xml'))
for (customer in customers.corporate.customer) {
    println "${customer.@name} works for ${customer.@company}"
}
