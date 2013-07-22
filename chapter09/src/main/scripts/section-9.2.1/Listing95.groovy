/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.5
 */
import static java.sql.DriverManager.getConnection

class Person {
    @Lazy
    def connection = getConnection('jdbc:odbc:dummy', 'sa', '')
}

assert new Person()

def p = new Person()
println p.connection
