@Grab(group = 'org.codehaus.groovy.modules.scriptom', module = 'scriptom', version = '1.6.0')
@GrabExclude("org.codehaus.groovy:groovy")

import org.codehaus.groovy.scriptom.ActiveXObject

def explorer = new ActiveXObject('InternetExplorer.Application')
explorer.Visible = true
explorer.AddressBar = true
explorer.Navigate('http://groovy.codehaus.org')
