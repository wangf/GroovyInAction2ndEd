import groovy.transform.TupleConstructor
import v03.model.Unit

@TupleConstructor
class Speed {
    double amount
    Unit unit

    String toString() { "$amount $unit/h" }
}
