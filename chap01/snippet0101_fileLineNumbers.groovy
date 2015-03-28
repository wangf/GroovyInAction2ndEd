//Groovy in Action, 2nd Ed.

def number = 0
new File('data.txt').eachLine { line ->
    number++
    println "$number: $line"
}
