@Grab('net.java.quickcheck:quickcheck:0.6')
import static net.java.quickcheck.generator.PrimitiveGenerators.*
import static java.lang.Math.round
import static Converter.celsius

class Converter {
    static celsius(fahrenheit) { (fahrenheit - 32) * 5 / 9 }
}

def gen = integers(-40, 240)                         //#1
def liquidC =  0..100
def liquidF = 32..212
100.times {
    int f = gen.next()                               //#2
    int c = round(celsius(f))
    assert c <= f                                    //#3
    assert c in liquidC == f in liquidF              //#4
}


