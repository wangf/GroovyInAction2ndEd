// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

assert "abc" == /abc/
assert "\\d" == /\d/

def    reference = "hello"
assert reference == /$reference/
