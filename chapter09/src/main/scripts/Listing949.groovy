import java.lang.reflect.Modifier
import java.util.concurrent.locks.ReentrantReadWriteLock



/**
 * Chapter 09
 * Section 9.7
 * Listing 9.49
 */
class ReadWriteLockTest extends GroovyTestCase {

    public void testLockFieldDefaultsForReadLock() {
        def tester = new GroovyClassLoader().parseClass('''
            class MyClass {
                @groovy.transform.WithReadLock
                public void readerMethod1() { }
            }
        ''')

        def field = tester.getDeclaredField('$reentrantlock')
        assert Modifier.isPrivate(field.modifiers)
        assert !Modifier.isTransient(field.modifiers)
        assert Modifier.isFinal(field.modifiers)
        assert !Modifier.isStatic(field.modifiers)
        assert field.type == ReentrantReadWriteLock
    }
}
