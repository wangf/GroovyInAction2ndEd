/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens (m86014)
 * Create Date: 2/15/15
 */
import groovy.xml.MarkupBuilder

def writer = new StringWriter()
def xml = new MarkupBuilder(writer)        //#A

xml.html {                            //#1
    head {                             //#1
        title('An XHTML Page')         //#1
    }
}

println writer
//#A Instantiate MarkupBuilder
//#1 Method calls that @TypeChecked would reject
