// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def http = [
        100: 'CONTINUE',
        200: 'OK',
        400: 'BAD REQUEST'
]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4
