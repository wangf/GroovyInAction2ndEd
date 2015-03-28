// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def with(Closure doit) {  // fake implementation
    doit.delegate = list
    doit()
}