// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

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
