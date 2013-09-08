import groovy.mock.interceptor.StubFor

def relay(request) {
    new Farm().getMachines().sort { it.load }[0].send(request)
}

def fakeOne = [load: 10, send: { false }]
def fakeTwo = [load: 5, send: { true }]

def farmStub = new StubFor(Farm)                       //#A
farmStub.demand.getMachines { [fakeOne, fakeTwo] }    //#B
farmStub.use {                                         //#C
    assert relay(null)
}

//def relay(request) {
//    new Farm().getMachines().sort { it.load }[0].send(request)
//}

class Farm {
    def getMachines() {
        /* some expensive code here */
    }
}
