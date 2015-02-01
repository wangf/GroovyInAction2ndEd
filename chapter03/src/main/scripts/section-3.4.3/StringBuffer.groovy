/**
 * Chapter 03
 * Section 3.4.3
 * 01-Feb-2015
 */


def greeting = 'Hello'

greeting <<= ' Groovy'                                 //#1

assert greeting instanceof java.lang.StringBuffer

greeting << '!'                                        //#2

assert greeting.toString() == 'Hello Groovy!'

greeting[1..4] = 'i'                                   //#A

assert greeting.toString() == 'Hi Groovy!'
