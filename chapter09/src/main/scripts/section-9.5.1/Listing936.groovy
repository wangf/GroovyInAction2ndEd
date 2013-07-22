import org.codehaus.groovy.runtime.InvokerHelper 

/**
 * Chapter 09
 * Section 9.5.1
 * Listing 9.36
 */
public class Person extends Object {
    private String firstName
    private String lastName
    private boolean $print$names

    @Override
    public String toString() {
        Object _result = new StringBuffer()
        _result.append('Person')
        _result.append('(')
        if ( $print$names ) {
            _result.append('firstName')
            _result.append(':')
        }

        _result.append(InvokerHelper.toString(
                firstName))
        _result.append(', ')
        if ( $print$names ) {
            _result.append('lastName')
            _result.append(':')
        }

        _result.append(InvokerHelper.toString(
                lastName))
        _result.append(')')
        return _result.toString()
    }
}
