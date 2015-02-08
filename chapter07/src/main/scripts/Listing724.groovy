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

def ulcDate = Date.parse('yyyy-MM-dd', '2015-01-01')
def otherDate = Date.parse('yyyy-MM-dd', '2015-02-02')
def ulc = new Product(dollar: 1499, name: 'ULC')           //#B
def ve = new Product(dollar: 499, name: 'Visual Editor') //#B
//#B
def invoices = [
        new Invoice(date: ulcDate, items: [
                new LineItem(count: 5, product: ulc),
                new LineItem(count: 1, product: ve)
        ]),
        new Invoice(date: otherDate, items: [
                new LineItem(count: 4, product: ve)
        ])
]//#B

def allItems = invoices.items.flatten()

assert [5 * 1499, 499, 4 * 499] == allItems*.total()                 //#1

assert ['ULC'] == allItems.grep { it.total() > 7000 }.product.name  //#2

def searchDates = invoices.grep {                         //#3
    it.items.any { it.product == ulc }                      //#3
}.date*.toString()                                       //#3
assert [ulcDate.toString()] == searchDates
