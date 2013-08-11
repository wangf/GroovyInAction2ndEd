import static groovy.io.FileType.ANY
import static groovy.io.FileVisitResult.SKIP_SUBTREE

def totalSize = 0
def count = 0
def sortByTypeThenName = { a, b ->
    a.isFile() != b.isFile() ? a.isFile() <=> b.isFile() : a.name <=> b.name
}

inputDir = new File('/Users/erikp/test/groovy')

inputDir.traverse(
        type         : ANY,
        nameFilter   : ~/.*\.groovy|.*\.java/,
        excludeNameFilter : ~/.*Test.*/,
        preDir       : { if (it.name == '.git') return SKIP_SUBTREE },
        postDir      : { println "Found $count files in $it.name : $totalSize bytes"
            totalSize = 0
            count = 0 },
        postRoot     : true,
        sort         : sortByTypeThenName
) {it -> totalSize += it.size(); count++ }
