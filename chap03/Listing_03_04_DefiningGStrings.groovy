// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

import static java.util.Calendar.*

def me       = 'Tarzan'
def you      = 'Jane'
def line     = "me $me - you $you"                            //#1
assert  line == 'me Tarzan - you Jane'

def date = new Date(0)
def dateMap = [y:date[YEAR]-1900, m:date[MONTH], d:date[DAY_OF_MONTH]]
def out = "Year $dateMap.y Month $dateMap.m Day $dateMap.d"   //#2
assert out == 'Year 69 Month 11 Day 31'

def tz = TimeZone.getTimeZone('GMT')
def format = 'd MMM YYYY HH:mm:SS z'
out = "Date is ${date.format(format, tz)} !"                  //#3
assert out == 'Date is 1 Jan 1970 00:00:00 GMT !'

//#4 start
def sql = """
SELECT FROM MyTable
  WHERE Year = $dateMap.y
"""
assert sql == """
SELECT FROM MyTable
  WHERE Year = 69
"""
//#4 end
out = "my 0.02\$"                                             //#A
assert out == 'my 0.02$'                                      //#B
//#1 Abbreviated dollar syntax
//#2 Extended dot syntax
//#3 Full syntax with braces
//#4 Multiline GStrings
//#A Escaped dollar sign
//#B Literal dollar sign
