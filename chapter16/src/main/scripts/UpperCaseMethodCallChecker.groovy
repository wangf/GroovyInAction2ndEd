import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.control.customizers.SecureASTCustomizer

class UpperCaseMethodCallChecker implements SecureASTCustomizer.ExpressionChecker {
    @Override
    boolean isAuthorized(Expression expr) {
        if (expr instanceof MethodCallExpression) {
            return expr.methodAsString == expr.methodAsString?.toUpperCase()
        }
        return true
    }
}
secure.addExpressionCheckers(new UpperCaseMethodCallChecker())
