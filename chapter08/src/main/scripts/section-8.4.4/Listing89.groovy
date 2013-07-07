/**
 * Chapter 08
 * Section 8.4.4
 * Listing 8.9
 */

def boxer = new Expando()

boxer.takeThis = 'ouch!'
boxer.fightBack = { times -> takeThis * times }

assert boxer.fightBack(3) == 'ouch!ouch!ouch!'

