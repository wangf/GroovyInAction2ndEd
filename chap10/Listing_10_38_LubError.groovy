import groovy.transform.TypeChecked

@TypeChecked
void notAllowed() {
    def var = "String"
    def cl = { var = new Date() }
    cl()
    var = var.toUpperCase()
}
