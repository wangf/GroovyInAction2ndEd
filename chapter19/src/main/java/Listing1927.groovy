import v02.model.Direction

def move(Direction dir) {
    [by: { Distance dist ->
        [at: { Speed speed ->
            println "robot moved $dir by $dist at $speed"
        }]
    }]
}
