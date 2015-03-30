import groovy.transform.TupleConstructor
import v03.model.*

@TupleConstructor
class Speed {
  double amount
  DistanceUnit unit

  String toString() { "$amount $unit/h" }
}
