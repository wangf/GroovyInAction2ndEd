/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens (m86014)
 * Create Date: 2/7/15
 */

def last
last = { it.size() == 1 ? it.head() : last.trampoline(it.tail()) }

last = last.trampoline()

assert last(0..10_000) == 10_000
