def given(Closure g) {
    def valueHolder = [:]
    g.delegate = valueHolder
    g.resolveStrategy = Closure.DELEGATE_FIRST
    g()
    [when: { Closure w ->
        w.delegate = valueHolder
        w.resolveStrategy = Closure.DELEGATE_FIRST
        w()
        [then: { Closure t ->
            t.delegate = valueHolder
            t.resolveStrategy = Closure.DELEGATE_FIRST
            t()
        }]
    }]
}
