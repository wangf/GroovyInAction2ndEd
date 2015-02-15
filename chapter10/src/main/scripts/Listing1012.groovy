/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.transform.TypeChecked

@TypeChecked
void printAuthors() {
    def authors = ['Dierk', 'Guillaume']
    printToUpperCase(authors)
}

void printToUpperCase(List<String> authors) {
    authors.each { println it.toUpperCase() }
}

printAuthors()
