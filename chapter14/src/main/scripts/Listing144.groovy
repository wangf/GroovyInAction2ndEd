def plan = new XmlParser().parse(new File('data/plan.xml'))   // #1

assert plan.name() == 'plan'
assert plan.week[0].name() == 'week'
def firstTask = plan.week[0].task[0]                          // #2
assert firstTask.name() == 'task'
assert firstTask.text() == 'easy'
assert firstTask.@title == 'read XML chapter'

