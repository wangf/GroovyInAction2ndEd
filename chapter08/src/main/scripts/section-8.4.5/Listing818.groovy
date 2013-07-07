/**
 * Chapter 08
 * Section 8.4.5
 * Listing 8.18
 */

import groovy.time.TimeCategory

def janFirst1970 = new Date(0)
use TimeCategory, {
    Date xMas = janFirst1970 + 1.year - 8.days
    assert xMas.month == Calendar.DECEMBER
    assert xMas.date == 24
}

use Collections, {
    def list = [0, 1, 2, 3]
    list.rotate 1
    assert list == [3, 0, 1, 2]
}
