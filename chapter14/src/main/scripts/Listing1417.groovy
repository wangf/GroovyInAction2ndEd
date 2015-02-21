import groovy.json.JsonSlurper

def plan = new JsonSlurper().parse(new File('data/plan.json'))
assert plan.weeks[0].tasks[0].status == 'easy'
assert plan.weeks[1].capacity == 8
assert plan.weeks[1].tasks[0].title == 're-read DB chapter'
