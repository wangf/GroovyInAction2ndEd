/**
 * Chapter 02
 * Section 2.3.8
 * 31-Jan-2015
 */

def http = [
        100 : 'CONTINUE',
        200 : 'OK',
        400 : 'BAD REQUEST'
]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4 
