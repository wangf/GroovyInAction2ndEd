import groovy.transform.TypeChecked

//@TypeChecked
void testMe() {

    ['a', 'b', 'c'].each { println it }

    ['a', 'b', 'c'].each { println it.toUpperCase() }

    [hannibal, face, howling_mad, ba].collect { it.team }

    10.times { println 2 * it }

    [milk: [1, 1.0], croissant: [4, 0.85]].inject(0) { sum, k, v -> sum += v[0] * v[1]; sum }
}

testMe()
