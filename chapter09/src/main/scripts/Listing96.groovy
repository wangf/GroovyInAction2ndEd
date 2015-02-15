/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.6
 */
import groovy.transform.IndexedProperty

class Author {
    String name
    @IndexedProperty
    List<String> books
}

def books = ['The Mysterious Affair at Styles',
             'The Murder at the Vicarage']

new Author(name: 'Agatha Christie', books: books).with {
    books[0] = 'Murder on the Orient Express'            //#1
    setBooks(0, 'Death on the Nile')                     //#2
    assert getBooks(0) == 'Death on the Nile'            //#3
}
