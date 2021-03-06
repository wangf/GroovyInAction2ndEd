import groovy.transform.TupleConstructor
@Grab('org.spockframework:spock-core:0.7-groovy-2.0')
import spock.lang.Specification

class Listing_17_16_SpockMockClosureChecks extends Specification {
    def "on couples night tickets are sold in pairs"() {
        given:
        def purchase = new Purchase("Lord of the Rings", 2)
        MovieTheater theater = Mock()
        theater.hasSeatsAvailable("Lord of the Rings", 2) >> true

        when:
        purchase.fill(theater)

        then:
        1 * theater.purchaseTicket(_, { it % 2 == 0 })            //#1
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
