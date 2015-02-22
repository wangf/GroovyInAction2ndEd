import org.junit.Test

class SimpleUnitTest extends GroovyTestCase {
    void testSimple() {
        assertEquals("Groovy should add correctly", 2, 1 + 1)
    }

    @Test
    void shouldAdd() {
        assertEquals("Groovy should add correctly", 2, 1 + 1)
    }

}