/**
 * Chapter 09
 * Section 9.2.5
 * Listing 9.20
 */


import groovy.transform.AutoClone

@AutoClone
class Chef1 {
    String name
    List<String> recipes
    Date born
}

def name = 'Heston Blumenthal'
def recipes = ['Snail porridge', 'Bacon & egg ice cream']
def born = Date.parse('yyyy-MM-dd', '1966-05-27')
def c1 = new Chef1(name: name, recipes: recipes, born: born)
def c2 = c1.clone()
assert c2.recipes == recipes
//Under the covers, your class will be augmented to look something like this:

//class Chef1 implements Cloneable {
//    ...
//    Chef1 clone() throws CloneNotSupportedException {
//        Chef1 _result = (Chef1) super.clone()
//        if (recipes instanceof Cloneable) {
//            _result.recipes = (List<String>) recipes.clone()
//        }
//        _result.born = (Date) born.clone()
//        return _result
//    }
//}


