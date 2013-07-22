import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.ast.stmt.ReturnStatement
/**
 * Chapter 09
 * Section 9.6.2
 * Listing 9.38
 */


def ast = new AstBuilder().buildFromSpec {
    returnStatement {
        constructorCall(Date) {
            argumentList {}
        }
    }
}

assert ast[0] instanceof ReturnStatement
