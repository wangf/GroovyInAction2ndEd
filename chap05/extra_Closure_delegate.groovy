// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def list = []
def expected = [1, 2]

list.with {
    add 1
    add 2
    assert delegate == expected
}