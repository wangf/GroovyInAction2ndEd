import groovy.transform.TypeChecked

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
@TypeChecked
void notAllowed() {
    def var = "String"
    def cl = { var = new Date() }
    cl()
    var = var.toUpperCase()
}
