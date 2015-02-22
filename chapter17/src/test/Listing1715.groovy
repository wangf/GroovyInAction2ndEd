import groovy.transform.TupleConstructor
@Grab('org.spockframework:spock-core:0.7-groovy-2.0')
import spock.lang.Specification

class Listing_17_15_SpockMockWildcards extends Specification {
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




    interface MovieTheater {
        void purchaseTicket(name, number)
        boolean hasSeatsAvailable(name, number)
    }

    @TupleConstructor
    class Purchase {
        def name, number, completed = false

        def fill(theater) {
            if (theater.hasSeatsAvailable(name, number)) {
                theater.purchaseTicket(name, number)
                completed = true
            }
        }
    }
}
