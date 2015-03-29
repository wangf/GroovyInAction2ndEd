import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import groovy.xml.MarkupBuilder

@TypeChecked
//#A
class HTMLExample {
    @TypeChecked(TypeCheckingMode.SKIP)
    //#B
    private static String buildPage(String pageTitle) {
        def writer = new StringWriter()
        def xml = new MarkupBuilder(writer)

        xml.html {
            head { title(pageTitle) }
        }
        writer
    }

    static String page404() {
        buildPage '404 - Not Found'
    }
}

HTMLExample.page404()

//#A Type-checked class
//#B But exclude this method
