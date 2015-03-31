import org.codehaus.groovy.ast.ClassCodeVisitorSupport
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.control.SourceUnit

class MyAstVisitor extends ClassCodeVisitorSupport {
    def source

    void visitConstantExpression(ConstantExpression exp) {
        if (exp.value instanceof String) {
            exp.value = 'Hello from our Visitor!'
        }
    }

    SourceUnit getSourceUnit() {
        source
    }
}
