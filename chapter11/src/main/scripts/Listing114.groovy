def builder = new NodeBuilder()                          //#1
def ulcDate = new Date(107, 0, 1)
def invoices = builder.invoices {                         //#2
    invoice(date: ulcDate) {                              //#3
        item(count: 5) {
            product(name: 'ULC', dollar: 1499)
        }
        item(count: 1) {
            product(name: 'Visual Editor', dollar: 499)
        }
    }
    invoice(date: new Date(106, 1, 2)) {
        item(count: 4) {
            product(name: 'Visual Editor', dollar: 499)
        }
    }
}

soldAt = invoices.grep {                                 //|#4
    it.item.product.any { it.'@name' == 'ULC' }        //|#4
}.'@date'                                             //|#4
assert soldAt == [ulcDate]
