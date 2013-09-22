import groovy.transform.TypeChecked

@TypeChecked
void testMe() {
    ['a', 'b', 'c'].each {
        println it
    }
    ['a', 'b', 'c'].each {
        String it -> println it.toUpperCase()
    }
    
//[hannibal, face, howling_mad, ba].collect {
//    Member m -> m.team
//}

    10.times {
        int idx -> println 2 * idx
    }

//    [milk: [1, 1.0], croissant: [4, 0.85]].inject(0) {
//        int sum, Map.Entry<String, List> entry ->
//            List<? extends Number> v = entry.value
//            sum += v[0] * v[1]
//            sum
//    }
}

testMe()
