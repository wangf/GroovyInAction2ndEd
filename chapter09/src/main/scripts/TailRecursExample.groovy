/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */


class ListUtil {
    static List reverse(List list) {
        if (list.isEmpty()) list
        else reverse(list.tail()) + list.head()
    }
}

assert ListUtil.reverse(['a', 'b', 'c']) == ['c', 'b', 'a']
