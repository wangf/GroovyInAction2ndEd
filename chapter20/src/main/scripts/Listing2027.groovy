@Grab('org.mbte.groovypp:groovypp-all:0.4.248_1.8.0')
@Grab('org.mbte.groovypp:groovypp:0.4.248_1.8.0')

@Typed                     //#1
class MyClass {

    int getHtmlSize() {
        String html = buildDynamicHtml()
        html.length()
    }

    @Typed(TypePolicy.DYNAMIC)       //|#2
    def buildDynamicHtml() {         //|#2
        def writer = new StringWriter()
        new groovy.xml.MarkupBuilder(writer).root {  //#3
            child()
            child()
        }
        writer.toString()
    }
}

assert 38 == new MyClass().htmlSize
