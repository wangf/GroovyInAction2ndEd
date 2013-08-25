import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer
import org.codehaus.groovy.control.customizers.SecureASTCustomizer
import static org.codehaus.groovy.syntax.Types.*

final ImportCustomizer imports = new ImportCustomizer().addStaticStars('java.lang.Math')
final SecureASTCustomizer secure = new SecureASTCustomizer()	//#1

secure.with {
    closuresAllowed = false						//#2
    methodDefinitionAllowed = false					//#3

    importsWhitelist = []						//#4
    staticImportsWhitelist = []					//#5
    staticStarImportsWhitelist = ['java.lang.Math'] 			//#6
    tokensWhitelist = [						//#7
            PLUS, MINUS, MULTIPLY, DIVIDE, MOD, POWER,
            PLUS_PLUS, MINUS_MINUS, COMPARE_EQUAL, COMPARE_NOT_EQUAL,
            COMPARE_LESS_THAN, COMPARE_LESS_THAN_EQUAL,
            COMPARE_GREATER_THAN, COMPARE_GREATER_THAN_EQUAL
    ]
    constantTypesClassesWhiteList = [
            Integer, Float, Long, Double, BigDecimal,		//#8
            Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE
    ]
    receiversClassesWhiteList = [Math,Integer,Float,			//#9
            Double,Long,BigDecimal]
}
def config = new CompilerConfiguration()
config.addCompilationCustomizers(imports, secure)
def shell = new GroovyShell(config)
def result = shell.evaluate('1+cos(PI/2)')
assert result==1
