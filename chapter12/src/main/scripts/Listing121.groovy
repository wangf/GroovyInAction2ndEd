/**
 * Chapter 12
 * Listing 12.1
 */

def newline = "\n"

assert newline.toString() == "\n"

//println newline.dump()

assert newline.dump() ==
        '''<java.lang.String@a value=[
] offset=0 count=1 hash=10>'''

assert newline.inspect() == /"\n"/
