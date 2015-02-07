import groovy.transform.Immutable

/**
 * Chapter 03
 * Section 3.3.2
 * 31-Jan-2015
 */
@Immutable
//#1
class Money {
    int amount
    String currency

    Money plus(Money other) {                         //#2
        if (null == other) return this
        if (other.currency != currency) {
            throw new IllegalArgumentException(
                    "cannot add $other.currency to $currency")
        }
        return new Money(amount + other.amount, currency)
    }

    Money plus(Integer more) {
        return new Money(amount + more, currency)
    }
}


Money buck = new Money(1, 'USD')
assert buck
assert buck == new Money(1, 'USD')              //#3
assert buck + buck == new Money(2, 'USD')              //#4

