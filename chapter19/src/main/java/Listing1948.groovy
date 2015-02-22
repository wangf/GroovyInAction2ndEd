import org.codehaus.groovy.ast.expr.*
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer
import org.codehaus.groovy.control.customizers.SecureASTCustomizer

import static org.codehaus.groovy.syntax.Types.*

def imports = new ImportCustomizer().addStaticStars('java.lang.Math')
def secure = new SecureASTCustomizer()

secure.with {
    closuresAllowed = false                                           //#1
    methodDefinitionAllowed = false                                   //#2

    importsWhitelist = []
    staticImportsWhitelist = []
    staticStarImportsWhitelist = ['java.lang.Math']

    tokensWhitelist = [
            PLUS, MINUS, MULTIPLY, DIVIDE, MOD, POWER, PLUS_PLUS,
            MINUS_MINUS, COMPARE_EQUAL, COMPARE_NOT_EQUAL,
            COMPARE_LESS_THAN, COMPARE_LESS_THAN_EQUAL,
            COMPARE_GREATER_THAN, COMPARE_GREATER_THAN_EQUAL,
    ]

    constantTypesClassesWhiteList = [
            Integer, Float, Long, Double, BigDecimal,
            Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE
    ]

    receiversClassesWhiteList = [
            Math, Integer, Float, Double, Long, BigDecimal
    ]

    statementsWhitelist = [
            BlockStatement, ExpressionStatement
    ]

    expressionsWhitelist = [
            BinaryExpression, ConstantExpression,
            MethodCallExpression, StaticMethodCallExpression,
            ArgumentListExpression, PropertyExpression,
            UnaryMinusExpression, UnaryPlusExpression,
            PrefixExpression, PostfixExpression,
            TernaryExpression, ElvisOperatorExpression,
            BooleanExpression, ClassExpression
    ]
}
def config = new CompilerConfiguration()
config.addCompilationCustomizers(imports, secure)
def shell = new GroovyShell(config)
def result = shell.evaluate('1+cos(PI/2)')
assert result == 1
