/**
 * Chapter 03
 * Section 3.4.2
 * 31-Jan-2015
 */

import static java.util.Calendar.*

def me       = 'Tarzan'
def you      = 'Jane'
def line     = "me $me - you $you"                            //#1
assert  line == 'me Tarzan - you Jane'

def date = new Date(0)
def dateMap = [y:date[YEAR]-1900, m:date[MONTH], d:date[DAY_OF_MONTH]]
def out = "Year $dateMap.y Month $dateMap.m Day $dateMap.d"   //#2
assert out == 'Year 70 Month 0 Day 1'

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
  WHERE Year = 70
"""
//#4 end
out = "my 0.02\$"                                             //#A
assert out == 'my 0.02$'                                      //#B
