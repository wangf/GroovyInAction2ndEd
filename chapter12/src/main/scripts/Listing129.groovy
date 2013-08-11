def n = System.lineSeparator()

reader = new StringReader('abc')
writer = new StringWriter()

reader.transformChar(writer) { it.next() }         //#B
assert 'bcd' == writer.toString()

reader = new File('data/example.txt').newReader()
writer = new StringWriter()

reader.transformLine(writer) { it - 'line' }      //#C
assert " one${n} two${n} three${n}" == writer.toString()

input  = new File('data/example.txt')
writer = new StringWriter()

input.filterLine(writer) { it =~ /one/ }          //#D
assert "line one${n}" == writer.toString()

writer = new StringWriter()
writer << input.filterLine { it.size() > 8 }      //#E
assert "line three${n}"  == writer.toString()
