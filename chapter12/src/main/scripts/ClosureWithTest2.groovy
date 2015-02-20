
class Address { String streetName, houseNumber}
Address gimme2() { new Address( streetName: 'Maine Street', houseNumber: '24') }

assert gimme2().streetName == 'Maine Street'
assert gimme2().houseNumber == '24'
