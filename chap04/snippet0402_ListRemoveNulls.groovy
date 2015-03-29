

def x = [1, null, 1]
assert [1, 1] == x.findAll { it != null }
assert [1, 1] == x.grep { it }
