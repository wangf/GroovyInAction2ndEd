import static com.manning.groovyinaction.YahooService.getYearEndClosing
import static groovyx.gpars.GParsPool.withPool

def tickers = ['AAPL', 'GOOG', 'IBM', 'ORCL', 'MSFT']

withPool(tickers.size()) {
    def top = tickers.makeConcurrent()
            .collect { [ticker: it, price: getYearEndClosing(it, 2009)] }
            .max { it.price }
    assert top == [ticker: 'GOOG', price: 619.98f]
}
