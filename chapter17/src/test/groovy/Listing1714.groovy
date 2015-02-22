import groovy.transform.TupleConstructor
import spock.lang.Specification

@Grab('org.spockframework:spock-core:0.7-groovy-2.0')




class MovieSpec extends Specification {
    def "buy ticket for a movie theater"() {
        given:
        def purchase = new Purchase("Lord of the Rings", 2)
        MovieTheater theater = Mock()                                 //#A
        theater.hasSeatsAvailable("Lord of the Rings", 2) >> true     //#B

        when:
        purchase.fill(theater)

        then:
        purchase.completed
        1 * theater.purchaseTicket("Lord of the Rings", 2)            //#C
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






