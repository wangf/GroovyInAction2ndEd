import groovy.xml.Namespace

def url = 'http://www.webservicex.net/CurrencyConvertor.asmx?WSDL'
def wsdl = new Namespace('http://schemas.xmlsoap.org/wsdl/', 'wsdl')
def doc = new XmlParser().parse(url)

println doc[wsdl.portType][wsdl.operation].'@name'
