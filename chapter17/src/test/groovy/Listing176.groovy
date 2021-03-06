import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

import static Converter.celsius

@RunWith(Parameterized)
//#1
class Listing_17_10_DataDrivenJUnitTest {
    private c, f, scenario

    @Parameters
    static scenarios() {
        [
                [0, 32, 'Freezing'],
                [20, 68, 'Garden party conditions'],
                [35, 95, 'Beach conditions'],
                [100, 212, 'Boiling']
        ]*.toArray()
    }

    Listing_17_10_DataDrivenJUnitTest(c, f, scenario) {
        this.c = c
        this.f = f
        this.scenario = scenario
    }

    @Test
    void convert() {
        def actual = celsius(f)
        def msg = "$scenario: ${f}°F should convert into ${c}°C"
        assert c == actual, msg
    }
}
