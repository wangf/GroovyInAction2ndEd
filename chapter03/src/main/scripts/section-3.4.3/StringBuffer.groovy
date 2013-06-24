/**
 * Chapter 03
 * Section 3.4.3
 */
def greeting = 'Hello'

greeting <<= ' Groovy' // #1 Leftshift and assign 

assert greeting instanceof java.lang.StringBuffer

greeting << '!' //#2 Leftshift on StringBuffer 

assert greeting.toString() == 'Hello Groovy!'

greeting[1..4] = 'i' //#3 Substring 'ello' becomes 'i' 

assert greeting.toString() == 'Hi Groovy!' 
