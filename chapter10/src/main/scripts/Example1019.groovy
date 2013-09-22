import groovy.xml.MarkupBuilder

def writer = new StringWriter()
def xml = new MarkupBuilder(writer)    //#1

xml.html {                //#2
    head {                //#3
        title('An XHTML Page')        //#4
    }
}

println writer
