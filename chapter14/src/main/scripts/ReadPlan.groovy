import javax.xml.parsers.DocumentBuilderFactory

def fac     = DocumentBuilderFactory.newInstance()
def builder = fac.newDocumentBuilder()
def doc     = builder.parse(new FileInputStream('data/plan.xml'))
