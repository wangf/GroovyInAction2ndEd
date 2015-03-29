@groovy.transform.TypeChecked
void testAssignmentsShouldThrowCompilationErrors() {
    Set set = new Object()                              //#A
    byte b = 200L                                       //#B
    List<Integer> list = ['Richard', 'Mary']            //#C
    int prim = null                                     //#D
}
//#A Cannot cast Object into Set
//#B Possible loss of precision
//#C Wrong generics
//#D Primitives cannot be null
