import org.gcontracts.annotations.*

@Grab('org.gcontracts:gcontracts-core:1.2.12')

@Invariant({ waterVolume >= 0; waterVolume <= maxVolume })
class Kettle {
    int waterVolume = 0
    int maxVolume = 1000

    // ... 
}

@Requires({ amount > 0 })
@Ensures({ waterVolume == maxVolume || waterVolume > old.waterVolume })
void addWater(int amount) {
    waterVolume = Math.min(maxVolume, amount + waterVolume)
}
