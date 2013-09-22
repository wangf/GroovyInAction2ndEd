class StringCalculationCategory {
    static def plus(String self, String operand) {
        try {
            return self.toInteger() + operand.toInteger()
        }
        catch (NumberFormatException fallback) {
            return (self << operand).toString()
        }
    }
}

use(StringCalculationCategory) {
    assert 1 == '1' + '0'
    assert 2 == '1' + '1'
    assert 'x1' == 'x' + '1'
}
