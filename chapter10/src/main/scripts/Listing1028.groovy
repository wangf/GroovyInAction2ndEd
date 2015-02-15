/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
import groovy.time.TimeCategory

class VacationHelper {
    static duration() {
        use(TimeCategory) {
            doCompute()
        }
    }

    static doCompute() { 1.week - 1.day }
}

assert VacationHelper.duration().toString() == '6 days'
