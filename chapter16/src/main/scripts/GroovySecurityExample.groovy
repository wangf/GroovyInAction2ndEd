def script = '''
    System.getProperty("file.encoding")
'''
def gcs = new GroovyCodeSource(script, "ScriptName", "/restricted")
def shell = new GroovyShell()
println shell.evaluate(gcs)
