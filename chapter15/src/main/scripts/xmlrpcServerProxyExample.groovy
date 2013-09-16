@Grab('org.codehaus.groovy:groovy-xmlrpc:0.8')
@GrabExclude('commons-logging:commons-logging')

import groovy.net.xmlrpc.XMLRPCServerProxy as Proxy

@Grab('org.codehaus.groovy:groovy-xmlrpc:0.8')
@GrabExclude('commons-logging:commons-logging')
import java.lang.Object

def remote = new Proxy('http://localhost:8080/')
assert 'Hello world!' == remote.echo('Hello world!')
