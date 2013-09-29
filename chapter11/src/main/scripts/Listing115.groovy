System.setProperty("user.timezone", "CET")
def builder = new NodeBuilder()
def invoices = builder.invoices {
    for (day in 1..3) {                               //#1
        invoice(date: new Date(107, 0, day)) {
            item(count: day) {
                product(name: 'ULC', dollar: 1499)
            }
        }
    }
}

def writer = new StringWriter()
invoices.print(new PrintWriter(writer))              //#2
def result = writer.toString().replaceAll("\r", "")   //#3

assert "\n" + result == """
invoices() {
  invoice(date:Mon Jan 01 00:00:00 CET 2007) {
    item(count:1) {
      product(name:'ULC', dollar:1499)
    }
  }
  invoice(date:Tue Jan 02 00:00:00 CET 2007) {
    item(count:2) {
      product(name:'ULC', dollar:1499)
    }
  }
  invoice(date:Wed Jan 03 00:00:00 CET 2007) {
    item(count:3) {
      product(name:'ULC', dollar:1499)
    }
  }
}
"""
