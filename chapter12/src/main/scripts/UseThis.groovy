/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/17/15
 */
class StringCasingCategory {
    static String lower(String string) {
        return string.toLowerCase()
    }
}

use(StringCasingCategory) {
    assert "groovy" == "GroOvy".lower()
}


