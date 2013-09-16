@Grab('org.mbte.groovypp:groovypp-all:0.4.248_1.8.0')
@Grab('org.mbte.groovypp:groovypp:0.4.248_1.8.0')

def str = "A string"
println str.toLowerCase()
str = 5    // reassigning a string variable to be an int!
println str
