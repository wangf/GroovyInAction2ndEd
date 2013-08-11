example = new File('data/example.txt')

lines = ['line one','line two','line three']
assert lines == example.readLines()

example.eachLine {
    assert it.startsWith('line')
}

hex = []
example.eachByte { hex << it }
assert hex.size() == example.size()

example.splitEachLine(/\s/){
    assert 'line' == it[0]
}

example.withReader { reader ->
    assert 'line one' == reader.readLine()
}

example.withInputStream { is ->
    assert 'line one' == is.readLine()
}
