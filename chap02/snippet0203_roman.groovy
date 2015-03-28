// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']  //#A
assert roman[4] == 'IV'                                     //#B

roman[8] = 'VIII'                                           //#C
assert roman.size() == 9

//#A List of Roman numerals
//#B List access
//#C List expansion
