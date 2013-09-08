def celsius(fahrenheit) { (fahrenheit - 32) * 5 / 9 }


assert 20  == celsius(68)
assert 35  == celsius(95)
assert -17 == celsius(0).toInteger()
assert 0   == celsius(32)
