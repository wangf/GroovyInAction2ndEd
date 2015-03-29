import groovy.transform.TypeChecked

class Logger {
    static void print(Closure<String> messageProvider) {
        println "Received message : ${messageProvider()}"
    }
}

@TypeChecked
void testMessage() {
    def returnsString = { 'Hello, Groovy!' }
    def returnsInt = { int x, int y -> x + y }
    Logger.print(returnsString)                            //#1
    Logger.print(returnsInt)                               //#2
}

//#1 Passes
//#2 Compilation fails
