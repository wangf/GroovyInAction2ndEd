import groovy.transform.Immutable

@Immutable class FixedBook { //AST annotation 
    String title
}

def gina = new FixedBook('Groovy in Action') //positional ctor 
def regina = new FixedBook(title: 'Groovy in Action') //named arg ctor 

assert gina.title == 'Groovy in Action'
assert gina == regina //standard equals() 

try {
    gina.title = "Oops!" //not allowed! 
    assert false, "should not reach here"
} catch (ReadOnlyPropertyException e) {
    //This is neat, standard Java getLocalizedMessage() groovy style
    println "Expected Error: '$e.localizedMessage'"
} 
