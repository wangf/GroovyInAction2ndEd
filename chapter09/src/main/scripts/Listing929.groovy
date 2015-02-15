/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens (m86014)
 * Create Date: 2/15/15
 */
import org.codehaus.groovy.ast.stmt.ReturnStatement
import static org.codehaus.groovy.ast.ClassHelper.make
import static org.codehaus.groovy.ast.tools.GeneralUtils.*

def ast = returnS(ctorX(make(Date)))
assert ast instanceof ReturnStatement
