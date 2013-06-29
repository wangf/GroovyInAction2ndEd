
/**
  * Chapter 04
  * Section 4.1.2
*/
result = ''               // #A
(5..9).each{ element ->   // #A
    result += element     // #A
}                         // #A
assert result == '56789'  // #A
assert (0..10).isCase(5)
age = 36                                          // #1
switch(age){                                      // #1
    case 16..20 : insuranceRate = 0.05 ; break    // #1
    case 21..50 : insuranceRate = 0.06 ; break    // #1
    case 51..65 : insuranceRate = 0.07 ; break    // #1
    default: throw new IllegalArgumentException() // #1
}                                                 // #1
assert insuranceRate == 0.06
ages = [20,36,42,56]                // #2
midage = 21..50                     // #2
assert ages.grep(midage) == [36,42] // #2 


