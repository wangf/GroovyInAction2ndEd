import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.ast.stmt.ReturnStatement

/**
 * Chapter 09
 * Section 9.6.4
 * Listing 9.41
 */
def ast = new AstBuilder().buildFromCode {
    new Date()
}
assert ast[0].statements[0] instanceof ReturnStatement
