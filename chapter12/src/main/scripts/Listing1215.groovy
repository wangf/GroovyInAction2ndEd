mailReminder = '''                                 	    //#A
Dear ${salutation?salutation+' ':''}$lastname,       	    //#A
another month has passed and it's time for these		    //#A
<%=tasks.size()%> tasks:  					    //#A
<% tasks.each { %>- $it 					    //#A
<% } %> 							    //#A
your collaboration is very much appreciated		    //#A
'''

def engine   = new groovy.text.SimpleTemplateEngine()
def template = engine.createTemplate(mailReminder)
def binding  = [
        salutation: 'Mrs.',                                      //#B
        lastname  : 'Davis',                                     //#B
        tasks     : ['visit the Groovy in Action (GinA) page',   //#B
                'chat with GinA readers']                   //#B
]

assert template.make(binding).toString() == '''     	    //#C
Dear Mrs. Davis,						    //#C                                  
another month has passed and it's time for these		    //#C
2 tasks:							    //#C
- visit the Groovy in Action (GinA) page           	    //#C
- chat with GinA readers 					    //#C
your collaboration is very much appreciated			//#C
'''
