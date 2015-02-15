/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
class Holder {
    def value = 'My value'                    //#1
}

@groovy.transform.TypeChecked
void testNoCompileTimeErrorDueToDef() {
    def holder = new Holder()                 //#2
    holder.value = 5                          //#3
}

testNoCompileTimeErrorDueToDef()
