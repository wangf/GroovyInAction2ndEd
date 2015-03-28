// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def result = (1 == 1) ? 'ok' : 'failed'
assert result == 'ok'
result = 'some string' ? 10 : ['x']
assert result == 10

