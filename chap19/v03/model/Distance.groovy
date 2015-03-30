import groovy.transform.TupleConstructor

import v03.model.*

@TupleConstructor
class Distance {
  double amount
  DistanceUnit unit

  Speed div(Duration dur) {
    new Speed(amount, unit)
  }

  String toString() { "$amount$unit" }
}
