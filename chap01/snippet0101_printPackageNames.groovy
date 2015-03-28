//Groovy in Action, 2nd Ed.

def classes = [String, List, File]
for (clazz in classes) {
    println clazz.package.name
}
