import groovy.transform.TypeChecked

@TypeChecked
void printMessage(Closure<String> messageProvider) {
    println "Received message : ${messageProvider()}"
}

@TypeChecked
void testMessage() {
    def returnsString = { 'Hello, Groovy!' }
    def returnsInt = { int x, int y -> x + y }
    printMessage(returnsString)            //#1
    printMessage(returnsInt)            //#2
}
