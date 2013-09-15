import groovyx.gpars.dataflow.stream.DataflowStream

import static groovyx.gpars.dataflow.Dataflow.operator
import static groovyx.gpars.dataflow.Dataflow.task

def chances = new DataflowStream()
def amounts = new DataflowStream()
def payouts = new DataflowStream()

operator(inputs: [chances, amounts],
        outputs: [payouts],
        { chance, amount -> payouts << chance * amount }
)

task { [0.1, 0.2, 0.3].each { chances << it } }
task { [300, 200, 100].each { amounts << it } }

[30, 40, 30].each { assert it == payouts.first }
