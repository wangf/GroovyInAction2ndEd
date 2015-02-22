def of = "silent word"                    //#1

def buy(n) {
    [shares: { of ->                        //#2
        [:].withDefault { ticker ->           //#3
            println "buy $n shares of $ticker"
        }
    }]
}
