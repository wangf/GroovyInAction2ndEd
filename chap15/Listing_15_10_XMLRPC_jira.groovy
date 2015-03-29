@Grab('org.codehaus.groovy:groovy-xmlrpc:0.8')
import groovy.net.xmlrpc.XMLRPCServerProxy as Proxy

class JiraProxy extends Proxy {
  JiraProxy(url) { super(url) }

  Object invokeMethod(String methodname, args) {
    super.invokeMethod('jira1.' + methodname, args)
  }
}

def jira = new JiraProxy('http://jira.codehaus.org/rpc/xmlrpc')

// insert your codehaus username and password below
jira.login('username', '****') { loginToken ->
  def projects = getProjectsNoSchemes(loginToken)
  println "${projects.size()} projects found in the codehaus jira"
  def groovy = projects.find { it.name == 'groovy' }
  if (groovy) {
    println "Found the $groovy.name project with key $groovy.key"
    println "Description: $groovy.description"
    println "Led by $groovy.lead and hosted at $groovy.projectUrl"
  }
}
