package v02

import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer
import v02.model.Robot

def binding = new Binding(robot: new Robot())                       //#1

def importCustomizer = new ImportCustomizer()                       //#2
importCustomizer.addStaticStars 'v02.model.Direction'               //#3

def config = new CompilerConfiguration()
config.addCompilationCustomizers importCustomizer                   //#4

def shell = new GroovyShell(this.class.classLoader, binding, config)  //#5
shell.evaluate '''
    robot.move left
'''
