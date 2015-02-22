package v02

def shell = new GroovyShell(this.class.classLoader)              //#1
shell.evaluate '''                                               //#2
import v02.model.Robot                                           //#2
import static v02.model.Direction.*                              //#2
                                                                 //#2
def robot = new Robot()                                          //#2
                                                                 //#2
robot.move left                                                  //#2
'''                                                              
