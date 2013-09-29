writer = new StringWriter()
builder = new groovy.xml.MarkupBuilder(writer)       //#1                            
invoices = builder.invoices {
    for (day in 1..3) {
        invoice(date: new Date(106, 0, day)) {
            item(count: day) {
                product(name: 'ULC', dollar: 1499)
            }
        }
    }
}

result = writer.toString().replaceAll("\r", "")

assert "\n" + result == """
<invoices>
  <invoice date='Sun Jan 01 00:00:00 CET 2006'>
    <item count='1'>
      <product name='ULC' dollar='1499' />
    </item>
  </invoice>
  <invoice date='Mon Jan 02 00:00:00 CET 2006'>
    <item count='2'>
      <product name='ULC' dollar='1499' />
    </item>
  </invoice>
  <invoice date='Tue Jan 03 00:00:00 CET 2006'>
    <item count='3'>
      <product name='ULC' dollar='1499' />
    </item>
  </invoice>
</invoices>"""
