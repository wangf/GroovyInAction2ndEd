import groovy.time.TimeCategory

class VacationHelper {
    static def duration() {
        use(TimeCategory) {
            doCompute()
        }
    }

    static def doCompute() { 1.week – 1.day }
}
