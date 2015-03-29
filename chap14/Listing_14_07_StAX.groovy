import javax.xml.stream.XMLInputFactory
import javax.xml.stream.XMLStreamReader

def input = 'file:data/plan.xml'.toURL()
def underway = []
def upcoming = []

def eachStartElement(inputStream, Closure yield) {
    def token = XMLInputFactory.newInstance()
            .createXMLStreamReader(inputStream)                       //#A
    try {
        while (token.hasNext()) {                                 //#B
            if (token.startElement) yield token
            token.next()
        }
    } finally {
        token?.close()
        inputStream?.close()
    }
}

class XMLStreamCategory {                                       //#C
    static Object get(XMLStreamReader self, String key) {       //#C
        return self.getAttributeValue(null, key)                //#C
    }                                                           //#C
}                                                               //#C

use(XMLStreamCategory) {
    eachStartElement(input.openStream()) { element ->
        if (element.name.toString() != 'task') return
        switch (element.done) {
            case '0':
                upcoming << element.title
                break
            case { it != element.total }:
                underway << element.title
        }
    }
}

assert underway == [
        'use in current project'
]
assert upcoming == [
        're-read DB chapter',
        'use DB/XML combination'
]
//#A Declare parser
//#B Loop through events of interest
//#C Category for simple attribute access
