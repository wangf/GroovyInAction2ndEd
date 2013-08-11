/**
 * Chapter 12
 * Listing 12.3
 */

file = new File('Listing_9_4_File_Iteration.groovy')
file.each{println it}
assert file.any {it =~ /File/}
assert 3 == file.findAll{it =~ /File/}.size()

assert 5 ==  file.grep{it}.size() 
