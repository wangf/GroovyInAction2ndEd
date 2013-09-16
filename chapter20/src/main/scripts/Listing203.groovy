def PARENT = 0
def OPTS = 0
def sh = new ActiveXObject('Shell.Application')
def folder = sh.BrowseForFolder(PARENT, 'Choose a folder', OPTS)
println "Chosen folder: ${folder.Items().Item().Path.value}"
