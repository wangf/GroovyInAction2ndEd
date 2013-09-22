class Invoice {                                          //#A
    List items                                        //#A
    Date date                                         //#A
}                                                        //#A
class LineItem {                                         //#A
    Product product                                      //#A
    int count                                        //#A
    int total() {                                        //#A
        return product.dollar * count                    //#A
    }                                                    //#A
}                                                        //#A
class Product {                                          //#A
    String name                                         //#A
    def dollar                                       //#A
}                                                        //#A

def ulcDate = new Date(107, 0, 1)
def ulc = new Product(dollar: 1499, name: 'ULC')           //#B
def ve = new Product(dollar: 499, name: 'Visual Editor') //#B
//#B
def invoices = [                                         //#B
        new Invoice(date: ulcDate, items: [                   //#B
                new LineItem(count: 5, product: ulc),              //#B
                new LineItem(count: 1, product: ve)                //#B
        ]),                                                  //#B
        new Invoice(date: [107, 1, 2], items: [                 //#B
                new LineItem(count: 4, product: ve)                //#B
        ])                                                   //#B
]                                                        //#B

assert [5 * 1499, 499, 4 * 499] == invoices.items.sum()*.total()   //#1

assert ['ULC'] ==
        invoices.items.sum().grep { it.total() > 7000 }.product.name  //#2

def searchDates = invoices.grep {                         //#3
    it.items.any { it.product == ulc }                      //#3
}.date*.toString()                                       //#3
assert [ulcDate.toString()] == searchDates
