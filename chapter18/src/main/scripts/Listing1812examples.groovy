import static com.manning.groovyinaction.YahooService.getYearEndClosing

def tickers = ['AAPL', 'GOOG', 'IBM', 'ORCL', 'MSFT']

def top = tickers
        .collect { [ticker: it, price: getYearEndClosing(it, 2009)] }
        .max { it.price }

println top