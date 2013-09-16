import org.gcontracts.annotations.*

@Grab('org.gcontracts:gcontracts-core:1.2.12')
//@Grab('junit:junit:4.11')

@Invariant({ waterVolume >= 0; waterVolume <= maxVolume })
class Kettle {
    int waterVolume = 0
    int maxVolume = 1000

    // ... 
}
