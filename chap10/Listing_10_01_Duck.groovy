class Duck {
    def methodMissing(String name, args) {          //#1
        println "$name!"                              //#2
    }
}

def duck = new Duck()
duck.quack()                                      //#A
//#1 Dynamic method missing behavior
//#2 Print name of method being called
//#A Call a dynamic method
