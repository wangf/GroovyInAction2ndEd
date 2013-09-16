@Typed                    //#1
package example

@Grab('org.mbte.groovypp:groovypp-all:0.4.248_1.8.0')
//#2
@Grab('org.mbte.groovypp:groovypp:0.4.248_1.8.0')
import groovy.lang.Grab

long result = 0
for (long x = 0; x < 100000000; x++) {
    result = result + x
}

assert result == 4999999950000000L
