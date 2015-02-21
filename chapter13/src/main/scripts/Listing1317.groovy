/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()
DbUtil.populate(sql)

def athletes = sql.dataSet('Athlete')

def result = []
athletes.each { result << it.firstname }                              //#1
assert result == ['Paul', 'Khalid', 'Ronaldo']                        //#A

athletes.add(
        firstname: 'Paula',
        lastname: 'Radcliffe',
        dateOfBirth: '1973-12-17'
)

result = athletes.rows().collect { it.firstname }                     //#2
assert result == ['Paul', 'Khalid', 'Ronaldo', 'Paula']               //#B
