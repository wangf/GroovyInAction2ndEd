package v02

import org.codehaus.groovy.control.CompilerConfiguration
import v02.integration.CaseRobotBaseScript
import v02.integration.CustomBinding
import v02.model.Robot

def binding = new CustomBinding(robot: new Robot())

def config = new CompilerConfiguration()
config.scriptBaseClass = CaseRobotBaseScript.name                 //#A

def shell = new GroovyShell(this.class.classLoader, binding, config)
shell.evaluate '''
    mOVe lEfT
'''
