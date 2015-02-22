import static groovyx.gpars.actor.Actors.*

def decrypt = reactor { code -> code.reverse() }   //#1
def audit   = reactor { println it }               //#2

def main    = actor   {                            //#3
    decrypt 'terces pot'                           //#4
    react { plainText ->                           //#5
        audit plainText                            //#6
    }
}
main.join()
audit.stop()
audit.join()
