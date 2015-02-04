// Chapter 01
// Section 1.2.1
// Approximate Page 13
// 04-Feb-2015

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
