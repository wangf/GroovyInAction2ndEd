/**
 * Chapter 06
 * Section 6.2.1
 * Listing 6.3
 */
if (true) assert true
else assert false
if (1) {
    assert true
} else {
    assert false
}
if ('non-empty') assert true
else if (['x']) assert false
else assert false
if (0) assert false
else if ([]) assert false
else assert true


