/**
 * Chapter 02
 * Section 2.3.9
 * 31-Jan-2015
 */

def totalClinks = 0
def partyPeople = 100
1.upto(partyPeople) { guestNumber ->
    clinksWithGuest = guestNumber - 1
    totalClinks += clinksWithGuest                     //#A
}
assert totalClinks == (partyPeople * (partyPeople - 1)) / 2

// Java snippet
//int totalClinks = 0;
//int partyPeople = 100;
//for(int guestNumber = 1;
//    guestNumber <= partyPeople;
//    guestNumber++) {
//    int clinksWithGuest = guestNumber-1;
//    totalClinks += clinksWithGuest;
//}
