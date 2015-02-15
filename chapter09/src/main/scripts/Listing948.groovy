import java.lang.reflect.Modifier
import java.util.concurrent.locks.ReentrantReadWriteLock

/**
 * Chapter 09
 * Section 9.7
 * Listing 9.48
 */
class ReadWriteLockTest extends GroovyTestCase {

    private static class MyClass {
        @groovy.transform.WithReadLock
        public void readerMethod1() {}
    }

    public void testLockFieldDefaultsForReadLock() {
        def field = MyClass.getDeclaredField('$reentrantlock')
        assert Modifier.isPrivate(field.modifiers)
        assert !Modifier.isTransient(field.modifiers)
        assert Modifier.isFinal(field.modifiers)
        assert !Modifier.isStatic(field.modifiers)
        assert field.type == ReentrantReadWriteLock
    }

}
