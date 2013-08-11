import groovy.inspect.swingui.ObjectBrowser
/**
 * Chapter 12
 * Listing 12.1
 */



def show = {
    println "Properties: ${it.properties}"
    println "Dump      : ${it.dump()}"
    println "Inspect   : ${it.inspect()}"
}

def obj = new ObjectBrowser() 
show obj

