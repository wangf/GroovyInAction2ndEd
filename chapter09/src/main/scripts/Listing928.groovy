/**
 * Chapter 09
 * Section 9.4
 * Listing 9.28
 */

import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.expr.ArgumentListExpression
import org.codehaus.groovy.ast.expr.ConstructorCallExpression
import org.codehaus.groovy.ast.stmt.ReturnStatement

def ast = new ReturnStatement(
        new ConstructorCallExpression(
                ClassHelper.make(Date),
                ArgumentListExpression.EMPTY_ARGUMENTS
        )
)

assert ast instanceof ReturnStatement

