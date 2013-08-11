@Grapes([
@Grab(group='org.eclipse.jetty.aggregate', module='jetty-server', version='8.1.9.v20130131'),
@Grab(group='org.eclipse.jetty.aggregate', module='jetty-servlet', version='8.1.9.v20130131'),
@Grab(group='javax.servlet', module='javax.servlet-api', version='3.0.1')])

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*
import static ServletContextHandler.*

def server = new Server(1234)
def context = new ServletContextHandler(server, "/", SESSIONS)
context.resourceBase = "."
context.addServlet(GroovyServlet, "*.groovy")
server.start()
