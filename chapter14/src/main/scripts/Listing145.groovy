def plan = new XmlSlurper().parse(new File('data/plan.xml'))

assert plan.week.task.size() == 5                          // #1
assert plan.week.task.@done*.toInteger().sum() == 6        // #2
assert plan.week[1].task.every{ it.@done == '0' }          // #3

assert plan.breadthFirst()*.name().join('->') ==           //|#4
        'plan->week->week->task->task->task->task->task'       //|#4
assert plan.depthFirst()*.name().join('->') ==             //|#4
        'plan->week->task->task->task->week->task->task'       //|#4
assert plan.depthFirst()*.name() == plan.'**'*.name()      //|#4

