import org.junit.*
import junit.framework.TestSuite

static Test suite() {
    def suite = new TestSuite()
    def gsuite = new GroovyTestSuite()
    suite.addTestSuite(gsuite.compile
            ("Listing_16_2_Calculator_Test.groovy"))
    suite.addTestSuite(gsuite.compile
            ("Listing_16_3_HashMap_Test.groovy"))
    return suite
}

junit.textui.TestRunner.run(suite())
