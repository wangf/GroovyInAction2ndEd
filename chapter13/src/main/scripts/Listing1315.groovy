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
  CREATE FUNCTION FULL_NAME (p_lastname VARCHAR(64))
  RETURNS VARCHAR(100)
  READS SQL DATA
  BEGIN ATOMIC
    DECLARE ans VARCHAR(100);
    SELECT CONCAT(firstname, ' ', lastname) INTO ans
    FROM Athlete WHERE lastname = p_lastname;
    RETURN ans;
  END
'''

assert sql.firstRow("{? = CALL FULL_NAME(?)}",
        ['Tergat'])[0] == 'Paul Tergat'
