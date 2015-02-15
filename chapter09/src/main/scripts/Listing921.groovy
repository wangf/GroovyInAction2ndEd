/**
 * Chapter 09
 * Section 9.2.5
 * Listing 9.21
 */
import groovy.transform.AutoClone
import groovy.transform.TupleConstructor

import static groovy.transform.AutoCloneStyle.COPY_CONSTRUCTOR

@TupleConstructor
@AutoClone(style = COPY_CONSTRUCTOR)
class Person {
    final String name
    final Date born
}

@TupleConstructor(includeSuperProperties = true,
        callSuper = true)
@AutoClone(style = COPY_CONSTRUCTOR)
class Chef2 extends Person {
    final List<String> recipes
}

def name = 'Jamie Oliver'
def recipes = ['Lentil Soup', 'Crispy Duck']
def born = Date.parse('yyyy-MM-dd', '1975-05-27')
def c1 = new Chef2(name, born, recipes)
def c2 = c1.clone()
assert c2.name == name
assert c2.born == born
assert c2.recipes == recipes


//protected Chef2(Chef2 other) {
//    super(other)
//    if (other.recipes instanceof Cloneable) {
//        this.recipes = (List<String>) other.recipes.clone()
//    } else {
//        this.recipes = other.recipes
//    }
//}
//
//public Chef2 clone() throws CloneNotSupportedException {
//    new Chef2(this)
//}

