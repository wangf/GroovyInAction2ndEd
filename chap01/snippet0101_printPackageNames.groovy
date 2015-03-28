// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def classes = [String, List, File]
for (clazz in classes) {
    println clazz.package.name
}
