@Grab(group = 'net.sf.jsqlparser', module = 'jsqlparser', version = '0.8.0')
//#1
import net.sf.jsqlparser.parser.CCJSqlParserManager


afterMethodCall { mc ->                            //#2
    def receiver = mc.receiver
    if (!isVariableExpression(receiver)) return                //#3

    def method = getTargetMethod(mc)                        //#4

    if (classNodeFor(groovy.sql.Sql) == getType(receiver)            //#5
            && method.name == 'eachRow') {
        def argList = getArguments(mc)
        if (argList && isConstantExpression(argList[0])) {            //#6
            def pm = new CCJSqlParserManager()                    //#7
            def sqlQuery = argList[0].text                    //#8

            try {
                pm.parse(new StringReader(sqlQuery))                //#9
            } catch (e) {
                addStaticTypeError("SQL query is not valid: $e",        //#10
                        argList[0])
            }
        }
    }
}
