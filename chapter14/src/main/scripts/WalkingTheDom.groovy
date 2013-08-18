import org.w3c.dom.Node
import javax.xml.parsers.DocumentBuilderFactory

def fac     = DocumentBuilderFactory.newInstance()
def builder = fac.newDocumentBuilder()
def doc     = builder.parse(new FileInputStream('data/plan.xml'))

println info(doc)

String info(node) {
    switch (node.nodeType) {
        case Node.ELEMENT_NODE:
            return 'element: '+ node.nodeName
        case Node.ATTRIBUTE_NODE:
            return "attribute: ${node.nodeName}=${node.nodeValue}"
        case Node.TEXT_NODE:
            return 'text: '+ node.nodeValue
    }
    return 'some other type: '+ node.nodeType
}
