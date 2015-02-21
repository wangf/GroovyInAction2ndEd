import com.manning.groovyinaction.UpdateChecker
import groovy.xml.XmlUtil

def plan = new XmlParser().parse(new File('data/plan.xml'))

plan.week[0].task[2].@done = '2'
plan.week[0].task[2].value = 'time saver'

plan.week[1].task[1].replaceNode {
    task(done: '0', total: '4', title: 'build web service')
}
plan.week[1].task[1] + {
    task(done: '0', total: '1', title: 'build web service client')
}
UpdateChecker.check(XmlUtil.serialize(plan))
