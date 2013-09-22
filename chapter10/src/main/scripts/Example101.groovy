class Duck {
    def methodMissing(String name, args) {
        // # 1
        println "$name!" //# 2
    }
}

def duck = new Duck()
duck.quack()
