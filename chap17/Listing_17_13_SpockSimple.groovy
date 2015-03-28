@Grab('org.spockframework:spock-core:0.7-groovy-2.0')
import spock.lang.Specification

class GivenWhenThenSpec extends Specification {

  def "test adding a new item to a set"() {
    given:
    def items = [4, 6, 3, 2] as Set

    when:
    items << 1

    then:
    items.size() == 5
  }
}
