

//java.lang.Integer
[15, 0x1234ffff, 0b00110011, 100_000_000].each {
  println "$it = ${it.class.name}"
  assert it.class.name == "java.lang.Integer"
}

//java.lang.Long
[100L, 200l, 26L].each {
  println "$it = ${it.class.name}"
  assert it.class.name == "java.lang.Long"
}

//java.lang.Float
[1.23f, 4.56F].each {
  println "$it = ${it.class.name}"
  assert it.class.name == "java.lang.Float"
}

//java.lang.Double
[1.23d, 4.56D].each {
  println "$it = ${it.class.name}"
  assert it.class.name == "java.lang.Double"
}

//java.math.BigInteger
[123g, 456G].each {
  println "$it = ${it.class.name}"
  assert it.class.name == "java.math.BigInteger"
}

//java.math.BigDecimal
[1.23, 4.56, 1.4E4, 2.8e4, 1.23g, 1.23G].each {
  println "$it = ${it.class.name}"
  assert it.class.name == "java.math.BigDecimal"
}
