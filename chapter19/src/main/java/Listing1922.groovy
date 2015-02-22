    import v03.model.Distance
    import v03.model.Unit

class DistanceCategory {
    static Distance getCentimeters(Number num) {
        new Distance(num, Unit.centimeter)
    }

    static Distance getMeters(Number num) {
        new Distance(num, Unit.meter)
    }

    static Distance getKilometers(Number num) {
        new Distance(num, Unit.kilometer)
    }
}
