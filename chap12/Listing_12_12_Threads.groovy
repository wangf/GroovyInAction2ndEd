import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

Thread.metaClass.'static'.getName = { Thread.currentThread().name } //#A

BlockingQueue sharedQueue = [] as LinkedBlockingQueue               //#B

Thread.start('push') {                                              //#C
    10.times {
        try {
            println("${Thread.name}\t: ${it}")
            sharedQueue << it
            sleep 100
        } catch (InterruptedException ignore) {
        }
    }
}

Thread.start('pop') {                                               //#D
    for (i in 0..9) {
        sleep 200
        println("${Thread.name}\t: ${sharedQueue.take()}")

    }
}
//#A Create new method to get thread name
//#B Create shared queue
//#C Start thread producing 10 items
//#D Start thread consuming 10 items
