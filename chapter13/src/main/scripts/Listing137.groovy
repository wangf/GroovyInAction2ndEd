/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()
DbUtil.populate(sql)                                                  //#A

assert sql.firstRow('SELECT COUNT(*) as num FROM Athlete').num == 3   //#B

sql.execute "DELETE FROM Athlete WHERE lastname = 'Tergat'"

assert sql.firstRow('SELECT COUNT(*) as num FROM Athlete').num == 2   //#C
