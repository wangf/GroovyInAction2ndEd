import com.clarkware.junitperf.ConstantTimer
import com.clarkware.junitperf.LoadTest
import com.clarkware.junitperf.TimedTest
import groovy.util.logging.Slf4j
import junit.framework.TestCase
import junit.textui.TestRunner
import org.junit.Test

class RegexFilterPerfGTest extends TestCase {

    RegexFilterPerfGTest(test) {
        super(test) //# A
    }

    void testOr() {// # B
        def filter = new RegexPackageFilter("java|org") //# C
        assertTrue("value should be true",
                filter.applyFilter("org.sf.String"))
    }

    static main(args) {
        TestRunner.run(RegexFilterPerfGTest.suite())
    }

    static Test suite() {
        def testCase = new RegexFilterPerfGTest("testOr") //# D
        //20 users for load staggered at 100 ms
        def loadTest = new LoadTest(testCase, 20, //# E
                new ConstantTimer(100))
        //each thread must return within 2100 ms
         new TimedTest(loadTest, 2100) //# F
    }
}

@Slf4j
class RegexPackageFilter {
    def applyFilter = {
        log.debug "Applying filter {}", it
    }
}