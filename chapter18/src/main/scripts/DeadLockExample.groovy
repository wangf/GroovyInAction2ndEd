import groovyx.gpars.dataflow.Dataflows

import static groovyx.gpars.dataflow.Dataflow.task

//def flow = new Dataflows()
//task { flow.x = flow.y }
//task { flow.y = flow.x }    //#1
//
//flow.x = Math.random() > 0.5 ? 1 : flow.y

def flow = new Dataflows()
task { flow.list = [0] }
task { flow.list[0] = 1 } //#1
println flow.list           //#2
