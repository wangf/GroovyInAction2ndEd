/**
 * Chapter 08
 * Section 8.4.1
 * Listing 8.7
 */

MetaClass mc = String.metaClass
final Object[] NO_ARGS = []
assert 1 == mc.respondsTo("toString", NO_ARGS).size()
assert 3 == mc.properties.size()
assert 75 == mc.methods.size()
assert 152 == mc.metaMethods.size()
assert "" == mc.invokeMethod("", "toString", NO_ARGS)
assert null == mc.invokeStaticMethod(String, "println", NO_ARGS)
assert "" == mc.invokeConstructor(NO_ARGS)

