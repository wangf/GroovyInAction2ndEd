/**
 * Chapter 08
 * Section 8.4.4
 * Listing 8.10
 */

assert String.metaClass=~/MetaClassImpl/
String.metaClass.low = { -> delegate.toLowerCase() }
assert String.metaClass=~/ExpandoMetaClass/

assert "DiErK".low() == "dierk"

