/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()
DbUtil.populate(sql)

sql.execute '''
    DROP   VIEW AthleteRecord IF EXISTS;
    CREATE VIEW AthleteRecord AS
      SELECT * FROM Athlete LEFT OUTER JOIN Record
        ON fkAthlete=athleteId;
'''

def records = sql.dataSet('AthleteRecord').findAll {
    it.firstname == 'Khalid'
}
def result = records.rows().collect { "$it.lastname $it.venue" }
assert ['Khannouchi London', 'Khannouchi Chicago'] == result
