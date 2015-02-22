import groovy.mock.interceptor.StubFor

class Farm {
    def getMachines() {
        /* some expensive code here */
    }
}

def relay(request) {
    new Farm().getMachines().sort { it.load }[0].send(request)
}

def fakeOne = new Expando(load:10, send: { false } )
def fakeTwo = new Expando(load:5,  send: { true }  )

def farmStub = new StubFor(Farm)                        //#A
farmStub.demand.getMachines { [fakeOne, fakeTwo ] }     //#B

farmStub.use {                                          //#|C
    assert relay(null)                                  //#|C
}                                                       
