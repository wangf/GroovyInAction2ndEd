import groovy.transform.Immutable

/**
 * Chapter 03
 * Section 3.3.2
 */
@Immutable class Money { //overrides == operator 
    int amount
    String currency

    Money plus(Money other) { //implements + operator 
        if (null == other) return this
        if (other.currency != currency) {
            throw new IllegalArgumentException(
                    "cannot add $other.currency to $currency")
        }
        return new Money(amount + other.amount, currency)
    }
}

Money buck = new Money(1, 'USD')
assert buck
assert buck == new Money(1, 'USD') //use overridden == 
assert buck + buck == new Money(2, 'USD') //use implemented + 

