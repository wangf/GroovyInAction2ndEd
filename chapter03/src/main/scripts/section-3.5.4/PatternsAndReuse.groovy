/**
 * Chapter 03
 * Section 3.5.4
 */

def twister = 'she sells sea shells at the sea shore of seychelles'
// some more complicated regex: 
// word that starts and ends with same letter 
def regex = /\b(\w)\w*\1\b/
def many = 100 * 1000

start = System.nanoTime()
many.times{
    twister =~ regex         // #1 
}
timeImplicit = System.nanoTime() - start

start = System.nanoTime()
pattern = ~regex             // #2  
many.times{
    pattern.matcher(twister) // #3 
}
timePredef = System.nanoTime() - start

assert timeImplicit > timePredef * 2 // #4

