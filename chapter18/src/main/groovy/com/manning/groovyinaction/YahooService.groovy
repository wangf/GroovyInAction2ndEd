package com.manning.groovyinaction

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-09-15
 */
class YahooService {
    static getYearEndClosingUnsafe(String ticker, int year) {
        def url = "http://ichart.finance.yahoo.com/table.csv?" +
                "s=$ticker&a=11&b=01&c=$year&d=11&e=31&f=$year&g=m"
        def data = url.toURL().text
        return data.split("\n")[1].split(",")[4].toFloat()
    }

    static getYearEndClosing(String ticker, int year) {
        try {
            getYearEndClosingUnsafe(ticker, year)
        } catch (all) {
            println "Could not get $ticker, returning -1. $all"
            return -1
        }
    }
}

