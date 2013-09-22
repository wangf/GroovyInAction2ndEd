class Traceable implements GroovyInterceptable {                //#A

    Writer writer = new PrintWriter(System.out)                 //#B
    private String indent = ''

    Object invokeMethod(String name, Object args) {              //#C
        writer.write "\n${indent}before '$name'"
        writer.flush()
        indent += '  '
        def result = metaClass.invokeMethod(this, name, args)   //#1
        indent -= '  '
        writer.write "\n${indent}after  '$name'"
        writer.flush()
        return result
    }
}

class Workhorse extends Traceable {                             //#D
    int outer() {
        return inner()
    }

    private int inner() {
        return 1
    }
}

def trace = new StringWriter(1024)
def traceMe = new Workhorse(writer: trace)                      //#E

assert 1 == traceMe.outer()                                     //#2

assert trace.toString() == """
before 'outer'
  before 'inner'
  after  'inner'
after  'outer'"""
