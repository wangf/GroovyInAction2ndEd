def base = 'http://news.bbc.co.uk/rss/newsonline_uk_edition/'
def url  = base +'front_page/rss091.xml'

println 'The top three news items today:'
def items = new XmlParser().parse(url).channel[0].item
for (item in items[0..2]) {
    println item.title.text()
    println item.link.text()
    println item.description.text()
    println '----'
}
