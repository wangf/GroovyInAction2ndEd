/**
 * Chapter 02
 * Section 2.3.2
 * 31-Jan-2015
 */
class BookBean {
    String title                                         //#A
}

def groovyBook = new BookBean()

groovyBook.setTitle('Groovy in Action')                //#B
assert groovyBook.getTitle() == 'Groovy in Action'     //#B

groovyBook.title = 'Groovy conquers the world'         //#C
assert groovyBook.title == 'Groovy conquers the world' //#C
