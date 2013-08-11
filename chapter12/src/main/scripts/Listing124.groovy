import static groovy.io.FileType.DIRECTORIES
import static groovy.io.FileType.FILES

inputDir = new File('/Users/erikp/test/groovy')

dirs = []
inputDir.eachDir { dirs << it.name }                            //#A
assert ['.git', 'doc', 'src'] == dirs

dirs = []
inputDir.eachDirRecurse { dirs << it.name }                     //#B
assert ['.git', 'doc', 'src', 'groovy', 'gina', 'java'] == dirs

dirs = []
inputDir.eachDirMatch(~/^(?!\.git).*/) { dirs << it.name }       //#C
assert ['doc', 'src'] == dirs

files = []
inputDir.eachFile { files << it.name }                           //#D
assert files.contains('LICENCE.txt')
assert files.contains('src')
files = []
inputDir.eachFile(FILES) { files << it.name }                    
