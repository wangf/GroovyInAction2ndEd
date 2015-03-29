import static util.DbUtil.*

def sql = create()
populate(sql)

sql.withTransaction {
    insertAthlete(sql, 'Haile', 'Gebrselassie', '1973-04-18')
    insertAthlete(sql, 'Patrick', 'Makau', '1985-03-02')
}

assert sql.firstRow('SELECT COUNT(*) as num FROM Athlete').num == 5
