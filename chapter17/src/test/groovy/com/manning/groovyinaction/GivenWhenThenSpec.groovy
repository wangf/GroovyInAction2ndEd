import spock.lang.Specification

class GivenWhenThenSpec extends Specification {

    def "test adding a new item to a set"() {
        given:
        def bag = [4, 6, 3, 2] as Set

        when:
        bag << 1

        then:
        bag.size() == 5
    }
}
