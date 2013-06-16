/**
 * Chapter 02
 * Section 2.3.8
 */
def totalClinks = 0
def partyPeople = 100
1.upto(partyPeople) { guestNumber ->
    clinksWithGuest = guestNumber - 1
    totalClinks += clinksWithGuest //modifies outer scope 
}
assert totalClinks == (partyPeople * (partyPeople - 1)) / 2 
println totalClinks


