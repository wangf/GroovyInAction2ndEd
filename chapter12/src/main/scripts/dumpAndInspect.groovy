/**
 * Chapter 12
 * Section 12.1
 */

Object.metaClass.methodMissing = { String name, Object args ->
    assert name.startsWith("findBy")
    assert args.size() == 1
    Object.metaClass."$name" = { value ->      
        delegate.find { it[name.toLowerCase() - 'findby'] == value }
    }
    delegate."$name"(args[0])                  
}

def data = [
        [name: 'moon', au: 0.0025],
        [name: 'sun', au: 1],
        [name: 'neptune', au: 30],
]

assert data.findByName('moon')    
assert data.findByName('sun')     
assert data.findByAu(1)

println data.dump()
println '.'
println data.inspect()

