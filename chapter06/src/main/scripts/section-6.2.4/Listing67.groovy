/**
 * Chapter 06
 * Section 6.2.4
 * Listing 6.7
 */


def host = /\/\/([a-zA-Z0-9-]+(\.[a-zA-Z0-9-])*?)(:|\/)/   //#A

assertHost 'http://a.b.c:8080/bla', host, 'a.b.c'
assertHost 'http://a.b.c/bla', host, 'a.b.c'
assertHost 'http://127.0.0.1:8080/bla', host, '127.0.0.1'
assertHost 'http://t-online.de/bla', host, 't-online.de'
assertHost 'http://T-online.de/bla', host, 'T-online.de'

def assertHost(candidate, regex, expected) {
    candidate.eachMatch(regex) { assert it[1] == expected }
} //#B

