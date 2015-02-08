/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */

def configurator = { format, filter, line ->                //#1
    filter(line) ? format(line) : null                       //#1
}
def appender = { config, append, line ->                    //#2
    def out = config(line)                                    //#2
    if (out) append(out)                                      //#2
}

def dateFormatter = { line -> "${new Date()}: $line" }    //#3
def debugFilter = { line -> line.contains('debug') }    //#3
def consoleAppender = { line -> println line }              //#3

def myConf = configurator.curry(dateFormatter, debugFilter) //#4
def myLog = appender.curry(myConf, consoleAppender)        //#4

myLog('here is some debug message')
myLog('this will not be printed')
