import groovy.transform.TupleConstructor
import v03.model.Unit

@TupleConstructor
class Distance {
    double amount
    Unit unit

    Speed div(Duration dur) {
        new Speed(amount, unit)
    }

    String toString() { "$amount$unit" }
}
