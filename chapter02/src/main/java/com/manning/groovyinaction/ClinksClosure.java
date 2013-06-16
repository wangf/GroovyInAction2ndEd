package com.manning.groovyinaction;

/**
 * Chapter 02
 * Section 2.3.8
 */
public class ClinksClosure {
    
    public static void main(String[] args) {
        // Java snippet 
        int totalClinks = 0;
        int partyPeople = 100;
        for(int guestNumber = 1;
            guestNumber <= partyPeople;
            guestNumber++) {
            int clinksWithGuest = guestNumber-1;
            totalClinks += clinksWithGuest;
        }
        System.out.println("Total number of Clinks: " + totalClinks);
    }
}
