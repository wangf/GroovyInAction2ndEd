import groovyx.gpars.dataflow.Dataflows

import static com.manning.groovyinaction.YahooService.getYearEndClosing
import static groovyx.gpars.dataflow.Dataflow.task

def tickers = ['AAPL', 'GOOG', 'IBM', 'ORCL', 'MSFT']

def price = new Dataflows()
tickers.each { ticker ->
    task { price[ticker] = getYearEndClosing(ticker, 2009) } //#1
}
def top = tickers.max { price[it] }                          //#2
assert top == 'GOOG' && price[top] == 619.98f
