file = new File('objects.dta')
objects = [1, "Hello Groovy!", new Date()]

file.withObjectOutputStream { outstream ->
    objects.each {
        outstream << it                         // #A
    }
}

retrieved = []
file.eachObject { retrieved << it }            // #B 

assert retrieved == objects
