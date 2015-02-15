import java.lang.reflect.Modifier


/**
 * Chapter 09
 * Section 9.7
 * Listing 9.50
 */
class ReadWriteLockTest extends GroovyTestCase {

    public void testLockFieldDefaultsForReadLock() {
        def tester = new GroovyShell().evaluate('''
            class MyClass {
                @groovy.transform.WithReadLock
                public void readerMethod1() { }
            }
            new MyClass()
        ''')

        def field = tester.getClass().getDeclaredField('$reentrantlock')
        assert Modifier.isPrivate(field.modifiers)
        // and more assertions...
    }
}

