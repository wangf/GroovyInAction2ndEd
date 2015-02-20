@Grab(group='org.eclipse.jetty.aggregate', module='jetty-server', version='8.1.16.v20140903')
@Grab(group='org.eclipse.jetty.aggregate', module='jetty-servlet', version='8.1.16.v20140903')
@Grab('javax.servlet:javax.servlet-api:3.0.1')

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*
import static org.eclipse.jetty.servlet.ServletContextHandler.*

def server = new Server(1234)
def context = new ServletContextHandler(server, "/", SESSIONS)
context.resourceBase = "."
context.addServlet(GroovyServlet, "*.groovy")
server.start()
