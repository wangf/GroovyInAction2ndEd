/**
 * Chapter 02
 * Section 2.3.2
 */
class BookBean {
    String title //Property declaration 
}

def groovyBook = new BookBean()

groovyBook.setTitle('Groovy conquers the world') //Property use with explicit method 
assert groovyBook.getTitle() == 'Groovy conquers the world'

groovyBook.title = 'Groovy in Action' //Property use with Groovy shortcuts
assert groovyBook.title == 'Groovy in Action' // 
