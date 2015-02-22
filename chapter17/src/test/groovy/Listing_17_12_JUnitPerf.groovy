@Grab('junitperf:junitperf:1.9.1')
@GrabResolver('https://repository.jboss.org/')
import com.clarkware.junitperf.*
import junit.framework.Test
import junit.framework.TestCase
import junit.textui.TestRunner

import static Converter.celsius

class Listing_17_12_JUnitPerf extends TestCase {
    Listing_17_12_JUnitPerf(String testName) {
        super(testName)                                                 //#A
    }

    void testConverter() {                                            //#B
        assert 0 == celsius(32)                                         //#C
        assert 100 == celsius(212)                                      //#C
    }

    static main(args) {
        TestRunner.run(suite())
    }

    static Test suite() {
        def testCase = new Listing_17_12_JUnitPerf("testConverter")     //#D

        def numUsers = 20                                               //#E
        def stagger = new ConstantTimer(100)                            //#E
        def loadTest = new LoadTest(testCase, numUsers, stagger)        //#F

        def timeLimit = 2100                                            //#G
        return new TimedTest(loadTest, timeLimit)                       //#H
    }
}

class Converter {
    static celsius(fahrenheit) { (fahrenheit - 32) * 5 / 9 }
}