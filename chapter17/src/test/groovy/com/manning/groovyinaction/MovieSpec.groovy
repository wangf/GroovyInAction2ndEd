package com.manning.groovyinaction

import groovy.transform.Canonical
import groovy.util.logging.Slf4j
import spock.lang.Specification

class MovieSpec extends Specification {

    def "buy ticket for a movie theater"() {
        given:
        def purchase = new Purchase("Lord of the rings", 2)
        MovieTheater theater = Mock()    //#A
        theater.hasSeatsAvailable("Lord of the rings", 2) >> true    //#B

        when:
        purchase.fill(theater)

        then:
        purchase.completed
        1 * theater.purchaseTicket("Lord of the rings", 2)    //#C
    }


    def "cannot buy a ticket when the movie is sold out"() {
        given:
        def purchase = new Purchase("Lord of the rings", 2)
        MovieTheater theater = Mock()

        when:
        theater.hasSeatsAvailable(_, _) >> false               //#A
        purchase.fill(theater)

        then:
        !purchase.completed
        0 * theater.purchaseTicket(_, _)                       //#B
    }

    def "test purchases are stored"() {
        given:
        Database database = Mock()
        MovieTheater movieTheater = new MovieTheater(database)

        when:
        movieTheater.purchaseTicket("Lord of the rings", 2)

        then:
        1 * database.update(_, {    //#A
            it == -2
        })
    }


}

@Slf4j
@Canonical
class Purchase {
    def title
    def quantity
    def completed = true

    Purchase(String t, Integer q) {
        title = t
        quantity = q
    }

    void fill(MovieTheater theater) {
        log.debug "Fill {}", theater.toString()
    }

}

@Slf4j
class MovieTheater {
    def Database database

    MovieTheater(Database d) {
        database = d
    }

    Boolean hasSeatsAvailable(String title, Integer quantity) {
        log.debug "Checking title {} for {} seat(s)", title, quantity
        true
    }

    void purchaseTicket(String title, Integer quantity) {
        log.debug "Purchasing {} seat(s) for title {}", quantity, title
    }

}

@Slf4j
class Database {

    void update(String title, Integer quantity) {
        log.debug "Updating {} seat(s) for title {}", quantity, title

    }

}