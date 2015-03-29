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
//#A Compile-time error!
