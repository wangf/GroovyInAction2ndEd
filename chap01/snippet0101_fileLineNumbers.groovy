// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def number = 0
new File('data.txt').eachLine { line ->
    number++
    println "$number: $line"
}
