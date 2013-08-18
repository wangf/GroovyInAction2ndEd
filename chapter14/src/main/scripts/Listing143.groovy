import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory

def doc  = DOMBuilder.parse(new FileReader('data/plan.xml'))
def plan = doc.documentElement
use(DOMCategory) {
    assert plan.name() == 'plan'                               //|#1
    assert plan.week[0].name() == 'week'                       //|#1
    assert plan.week[0].'@capacity' == '8'                     // #2
    assert plan.week.task[0].name() == 'task'
    assert plan.week.task[0].text() == 'easy'                  // #3
}
