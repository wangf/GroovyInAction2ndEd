/**
 * Chapter 04
 * Section 4.3.3
 * Listing 4.16
 */

def textCorpus =
        """
Look for the bare necessities
The simple bare necessities
Forget about your worries and your strife
I mean the bare necessities
Old Mother Nature's recipes
That bring the bare necessities of life
"""

def words = textCorpus.tokenize()
def wordFrequency = [:]
words.each { word ->
    wordFrequency[word] = wordFrequency.get(word, 0) + 1  // #1
}
def wordList = wordFrequency.keySet().toList()
wordList.sort { wordFrequency[it] }                      // #2

def statistic = "\n"
wordList[-1..-6].each { word ->
    statistic += word.padLeft(12) + ': '
    statistic += wordFrequency[word] + "\n"
}

wordFrequency.each {
    println(it)
}

assert statistic ==
"""
        bare: 4
 necessities: 4
         the: 3
        your: 2
         for: 1
     recipes: 1
"""
