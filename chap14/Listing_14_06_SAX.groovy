import org.xml.sax.Attributes
import org.xml.sax.InputSource
import org.xml.sax.helpers.DefaultHandler

import javax.xml.parsers.SAXParserFactory

class PlanHandler extends DefaultHandler {                  //#1
    def underway = []
    def upcoming = []

    void startElement(String namespace, String localName,
                      String qName, Attributes atts) {                //#2
        if (qName != 'task') return                         //#3
        def title = atts.getValue('title')
        def total = atts.getValue('total')
        switch (atts.getValue('done')) {
            case '0': upcoming << title; break
            case { it != total }: underway << title; break
        }
    }
}

def handler = new PlanHandler()
def factory = SAXParserFactory.newInstance()
def reader = factory.newSAXParser().XMLReader               //#4
reader.contentHandler = handler
new File('data/plan.xml').withInputStream { is ->
    reader.parse(new InputSource(is))
}

assert handler.underway == [
        'use in current project'
]
assert handler.upcoming == [
        're-read DB chapter',
        'use DB/XML combination'
]
//#1 Declare our handler
//#2 Interested in element start events
//#3 Interested only in task elements
//#4 Declare our SAX reader
