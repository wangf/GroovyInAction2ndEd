import org.codehaus.groovy.runtime.StringBufferWriter

class Whatever {
    int outer() {
        return inner()
    }

    int inner() {
        return 1
    }
}

def log = new StringBuffer("\n")
def tracer = new TracingInterceptor()                  //#A
tracer.writer = new StringBufferWriter(log)
def proxy = ProxyMetaClass.getInstance(Whatever.class) //#B
proxy.interceptor = tracer
proxy.use {                                            //#C
    assert 1 == new Whatever().outer()                   //#D
}

assert log.toString() == """
before Whatever.ctor()
after  Whatever.ctor()
before Whatever.outer()
  before Whatever.inner()
  after  Whatever.inner()
after  Whatever.outer()
"""
