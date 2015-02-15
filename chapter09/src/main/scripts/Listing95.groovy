/**
 * Chapter 09
 * Section 9.2.1
 * Listing 9.5
 */
class Resource {                                      //#1
    private static alive = 0
    private static used = 0
    Resource() { alive++ }
    def use() { used++ }
    static stats() { "$alive alive, $used used" }
}

class ResourceMain {
    def res1 = new Resource()                         //#2
    @Lazy res2 = new Resource()                       //#3
    @Lazy static res3 = { new Resource() }()          //#4
    @Lazy(soft=true) volatile Resource res4           //#5
}

new ResourceMain().with {
    assert Resource.stats() == '1 alive, 0 used'      //#6
    res2.use()
    res3.use()
    res4.use()
    assert Resource.stats() == '4 alive, 3 used'      //#7
    assert res4 instanceof Resource                   //#8
    def expected = 'res4=java.lang.ref.SoftReference'
    assert it.dump().contains(expected)               //#9
}
