/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()
DbUtil.populate(sql)

def qry = 'SELECT * FROM Athlete'
assert sql.rows(qry, 1, 2)*.lastname == ['Tergat', 'Khannouchi']
assert sql.rows(qry, 3, 2)*.lastname == ['da Costa']

