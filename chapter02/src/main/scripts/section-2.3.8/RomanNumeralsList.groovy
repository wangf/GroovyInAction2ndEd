/**
 * Chapter 02
 * Section 2.3.8
 * 31-Jan-2015
 */

def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']  //#A
assert roman[4] == 'IV'                                     //#B

roman[8] = 'VIII'                                           //#C
assert roman.size() == 9

