/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/14/15
 */

@Category(Integer)
//#1
class IntegerMarshal {
    String marshal() {
        toString()                                         //#2
    }
}

@Category(String)
class StringMarshal {
    Integer unMarshal() {
        this.toInteger()                                   //#3
    }
}

use([IntegerMarshal, StringMarshal]) {                //#4
    assert 1.marshal() == "1"
    assert "1".unMarshal() == 1
}
