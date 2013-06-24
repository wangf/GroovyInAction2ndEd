/**
 * Chapter 03
 * Section 3.4.2
 */

def me   = 'Tarzan'            //|#1 Abbreviated 
def you  = 'Jane'              //|#1 dollar syntax 
def line = "me $me - you $you" //|#1 
assert line == 'me Tarzan - you Jane'

def date = new Date(0)                                       //|#2 Extended 
def out = "Year $date.year Month $date.month Day $date.date" //|#2 abbreviation 
assert out == 'Year 70 Month 0 Day 1'

out = "Date is ${date.toGMTString()} !"           //|#3 Full syntax with 
assert out == 'Date is 1 Jan 1970 00:00:00 GMT !' //|#3 braces 
//#4 Multiline GStrings start 
def sql = """ 
SELECT FROM MyTable 
  WHERE Year = $date.year 
"""
assert sql ==
        """ 
SELECT FROM MyTable 
  WHERE Year = 70 
"""                                          //#4 Multiline GStrings end 
out = "my 0.02\$"                            //#5 Escaped dollar sign
assert out == 'my 0.02$'                     //#6 Literal dollar sign 
