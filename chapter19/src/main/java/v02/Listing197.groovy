package v02

import v02.model.Robot

def binding = new Binding(robot: new Robot())                  //#1

def shell = new GroovyShell(this.class.classLoader, binding)   //#2
shell.evaluate '''
    import static v02.model.Direction.*

    robot.move left
'''
