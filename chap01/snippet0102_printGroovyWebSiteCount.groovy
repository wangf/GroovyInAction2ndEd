//Groovy in Action, 2nd Ed.

import static groovyx.gpars.GParsPool.withPool

def urls = [
        'http://groovy.codehaus.org',
        'http://gpars.codehaus.org',
        'http://gr8conf.org/'
]*.toURL()

println withPool {
    urls.collectParallel {
        it.text.findAll(~/[Gg]roovy/).size()
    }
}
