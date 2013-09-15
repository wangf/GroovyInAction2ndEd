import static com.manning.groovyinaction.YahooService.getYearEndClosing
import static groovyx.gpars.GParsPool.withPool

def ticker = ['AAPL', 'GOOG', 'IBM', 'ORCL', 'MSFT']

withPool(ticker.size()) {
    def top = ticker.parallel
            .map { [ticker: it, price: getYearEndClosing(it, 2009)] }
            .max { it.price }
    assert top == [ticker: 'GOOG', price: 619.98f]
}
