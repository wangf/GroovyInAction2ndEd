/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
@TupleConstructor
import groovy.transform.*

@TupleConstructor
class Author {
    String first
    String last
    int born
}

@TypeChecked
Author createAuthor(List params) {
    Author a = params                //#A
    a
}

createAuthor(['Agatha', 'Christie', 1890])
