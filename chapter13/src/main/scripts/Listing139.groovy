/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()
DbUtil.populate(sql)
DbUtil.enableLogging()

sql.withBatch { stmt ->
    stmt.addBatch '''
    INSERT INTO Athlete (firstname, lastname, dateOfBirth)
    VALUES ('Paula', 'Radcliffe', '1973-12-17')'''
    stmt.addBatch """
    INSERT INTO Record (time, venue, whenRun, fkAthlete)
      SELECT ${2*60*60+15*60+25}, 'London', '2003-04-13',
      athleteId FROM Athlete WHERE lastname='Radcliffe'"""
}

assert sql.firstRow('SELECT COUNT(*) as num FROM Athlete').num == 4
assert sql.firstRow('SELECT COUNT(*) as num FROM Record').num == 5

def qry = '''
  INSERT INTO Athlete (firstname, lastname, dateOfBirth)
  VALUES (?,?,?)
'''
sql.withBatch(3, qry) { ps ->
    ps.addBatch('Catherine', 'Ndereba', '1972-07-21')
    ps.addBatch('Naoko', 'Takahashi', '1972-05-06')
    ps.addBatch('Tegla', 'Loroupe', '1973-05-09')
    ps.addBatch('Ingrid', 'Kristiansen', '1956-03-21')
}

assert sql.firstRow('SELECT COUNT(*) as num FROM Athlete').num == 8


