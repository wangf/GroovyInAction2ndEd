/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import static util.DbUtil.*

def sql = create()
populate(sql)

sql.withTransaction {
    insertAthlete(sql, 'Haile', 'Gebrselassie', '1973-04-18')
    insertAthlete(sql, 'Patrick', 'Makau', '1985-03-02')
}

assert sql.firstRow('SELECT COUNT(*) as num FROM Athlete').num == 5
