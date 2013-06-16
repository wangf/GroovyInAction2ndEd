//**********************
//Chapter 01
//Section 1.1.3
//Approximate Page 9
//**********************

def classes = [String, List, File]
for (clazz in classes) {
    println clazz.package.name
}