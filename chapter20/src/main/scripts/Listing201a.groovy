@Grab(group = 'org.ccil.cowan.tagsoup', module = 'tagsoup', version = '1.2')
import org.ccil.cowan.tagsoup.Parser

def parser = new XmlParser(new Parser())
def html = parser.parse("http://twitter.com/hamletdrc")

html.body.'**'.a.@href.grep(~/http.*status.*/) each {
    println it
}
