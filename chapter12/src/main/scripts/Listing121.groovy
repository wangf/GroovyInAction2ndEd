/**
 * Chapter 12
 * Listing 12.1
 */

def newline = "\n"

assert newline.toString() == "\n"

//println newline.dump().bytes
//println '''<java.lang.String@a value=
// hash=10 hash32=0>'''.bytes

assert newline.dump() ==
        '''<java.lang.String@a value=
hash=10 hash32=0>'''


assert newline.inspect() == /'\n'/

groovy.inspect.swingui.ObjectBrowser.inspect(newline)
