import groovy.xml.Namespace

def url = 'http://www.ibm.com/developerworks/views/java/rss/' +
        'libraryview.jsp?feed_by=atom'
def atom = new Namespace('http://www.w3.org/2005/Atom')
def numEntries = 3                                                  //#A
def entries = new XmlParser().parse(url)[atom.entry][0..<numEntries]
def len = "dd mmm yyyy ".size()                                     //#B
def summaries = entries.collect {
    it[atom.published].text()[0..<len] +
            (it[atom.summary].text().contains('Groovy') ? '*' : ' ') +
            it[atom.title].text()
}
println summaries.join("\n")
