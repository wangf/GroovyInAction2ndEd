/**
 * Chapter 03
 * Section 3.5.5
 */

def fourLetters = ~/\w{4}/

assert fourLetters.isCase('work')

assert 'love' in fourLetters

switch('beer'){
    case ~/\w{4}/ : assert true; break
    default : assert false
}

beasts = ['bear','wolf','tiger','regex']

assert beasts.grep(fourLetters) == ['bear','wolf'] 


