class Address {
    String streetName, houseNumber
}

Address gimme() {
  new Address().with {
        streetName = 'Mainstreet'
        houseNumber = '42'
    }
}
assert gimme().streetName == 'Mainstreet'
assert gimme().houseNumber == '42'
