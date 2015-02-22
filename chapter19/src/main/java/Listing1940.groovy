final class FetchOptions {                           //#2
    private int limit, offset, chunkSize, prefetchSize

    private FetchOptions() {}                          //#3

    FetchOptions limit(int lim) {
        this.limit = lim
        return this                                      //#1
    }

    FetchOptions offset(int offs) {
        this.offset = offs
        return this
    }

    FetchOptions chunkSize(int cs) {
        this.chunkSize = cs
        return this
    }

    FetchOptions prefetchSize(int ps) {
        this.prefetchSize = ps
        return this
    }

    static final class Builder {                       //#5
        private Builder() {}                             //#6
        static FetchOptions withDefaults() {             //#4
            new FetchOptions()                             //#4
        }

        static FetchOptions withLimit(int lim) {         //#7
            new FetchOptions().limit(lim)
        }

        static FetchOptions withOffset(int offs) {
            new FetchOptions().offset(offs)
        }

        static FetchOptions withChunkSize(int cs) {
            new FetchOptions().chunkSize(cs)
        }

        static FetchOptions withPrefetchSize(int ps) {
            new FetchOptions().prefetchSize(ps)
        }
    }
}
