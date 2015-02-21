import javax.xml.parsers.DocumentBuilderFactory

import static org.w3c.dom.Node.*

def factory = DocumentBuilderFactory.newInstance()
def builder = factory.newDocumentBuilder()
def doc = builder.parse(new FileInputStream('data/plan.xml'))
def plan = doc.documentElement

String info(node) {
    switch (node.nodeType) {
        case ELEMENT_NODE:
            return "element: $node.nodeName"
        case ATTRIBUTE_NODE:
            return "attribute: $node.nodeName=$node.nodeValue"
        case TEXT_NODE:
            return "text: $node.nodeValue"
    }
    return "some other type: $node.nodeType"
}

assert info(plan) == 'element: plan'
assert plan.childNodes.length == 5                              //#1

def firstWeek = plan.childNodes.find { it.nodeName == 'week' }  //#2
assert info(firstWeek) == 'element: week'

def firstTask = firstWeek.childNodes.item(1)                    //#3
assert info(firstTask) == 'element: task'

def firstTaskText = firstTask.childNodes.item(0)
assert info(firstTaskText) == 'text: easy'

def firstTaskTitle = firstTask.attributes.getNamedItem('title')
assert info(firstTaskTitle) == 'attribute: title=read XML chapter'

def firstTaskTitleText = firstTaskTitle.childNodes.item(0)
assert info(firstTaskTitleText) == 'text: read XML chapter'
