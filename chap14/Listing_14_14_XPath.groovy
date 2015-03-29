import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory

import javax.xml.xpath.XPathFactory

import static javax.xml.xpath.XPathConstants.NODESET
import static javax.xml.xpath.XPathConstants.NUMBER

def doc = DOMBuilder.parse(new FileReader('data/plan.xml'))
def plan = doc.documentElement
def xpath = XPathFactory.newInstance().newXPath()

def out = new StringBuilder()
use(DOMCategory) {                                             //#1
    xpath.evaluate('//week', plan, NODESET).eachWithIndex {
        wk, i ->                                                   //#2
            out << "\nWeek No. $i\n"
            int total = xpath.evaluate('sum(task/@total)', wk, NUMBER) //#3
            int done = xpath.evaluate('sum(task/@done)', wk, NUMBER)   //#3
            out << " planned $total of ${wk.'@capacity'}\n"            //#4
            out << " done    $done of $total"
    }
}
assert out.toString() == '''
Week No. 0
 planned 7 of 8
 done    6 of 7
Week No. 1
 planned 4 of 8
 done    0 of 4'''
//#1 Use DOMCategory for simple attribute access
//#2 Selection via XPath, retrieving index and value
//#3 Evaluation using XPath
//#4 Evaluation using DOM attributes directly
