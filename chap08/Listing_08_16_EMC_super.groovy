class MySuperGroovy {}

class MySubGroovy extends MySuperGroovy {}

MySuperGroovy.metaClass.added = { -> true }

assert new MySubGroovy().added()

//ExpandoMetaClass.enableGlobally() // xxx delete?

Map.metaClass.toTable = { ->
    delegate.collect { [it.key, it.value] }
}

assert [a: 1, b: 2].toTable() == [
        ['a', 1],
        ['b', 2]
]

