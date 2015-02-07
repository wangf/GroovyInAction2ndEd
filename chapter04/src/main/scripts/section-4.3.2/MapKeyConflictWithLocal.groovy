/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */


def x = 'a'
assert ['x': 1] == [x: 1]
assert ['a': 1] == [(x): 1]
