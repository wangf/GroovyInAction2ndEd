import groovy.transform.TypeChecked

@TypeChecked
def flowTyping() {
    def var = 'A string'        //#1
    var = var.toUpperCase()    //#2
    var = var.length()        //#3
    var = String.valueOf(var)    //#4
    var = 2 * var        //#5
    var
}
