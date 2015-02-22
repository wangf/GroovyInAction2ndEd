def binding = new Binding([distance: 11400, time: 5 * 60])  //#1

def shell = new GroovyShell(binding)        //#2
shell.evaluate '''
    speed = distance / time                 //#3
'''

assert binding.distance == 11400            //#4
assert binding.time == 5 * 60               //#4
assert binding.speed == 38                  //#5
