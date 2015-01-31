//**********************
//Chapter 01
//Section 1.1.3
//Approximate Page 10
//31-Jan-2015
//**********************

def classes = [String, List, File]
for (clazz in classes) {
    println clazz.package.name
}