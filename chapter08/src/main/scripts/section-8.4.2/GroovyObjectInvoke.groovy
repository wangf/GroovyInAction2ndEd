/**
 * Chapter 08
 * Section 8.4.2
 */

def groovyObjectInvoke(Object obj, String method, Object args) {
    if (obj instanceof GroovyInterceptable) {
        return obj.metaClass.invokeMethod(method, args)
    }
    if (!obj.metaClass.respondsTo(method, args)) {
        return obj.metaClass.invokeMethod(method, args)
    }
    obj.metaClass.invokeMethod(obj, method, args)
}

