import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.ast.stmt.SynchronizedStatement

class SynchronizedOnGetClassAstVisitor {
//        extends AbstractAstVisitor {

    void visitSynchronizedStatement(SynchronizedStatement statement) {

        if (statement.expression instanceof MethodCallExpression) {
            def method = statement.expression
            def argumentCount = 0
            if (AstUtil.isMethodNamed(method, 'getClass', argumentCount)) {
                addViolation statement
            }
        }
        super.visitSynchronizedStatement(statement);
    }
}
