/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()

sql.execute '''
  INSERT INTO Athlete (firstname, lastname, dateOfBirth)
  VALUES ('Paul', 'Tergat', '1969-06-17')
'''                                                                   //#A

def data = [first: 'Khalid', last: 'Khannouchi', birth: '1971-12-22']
def keys = sql.executeInsert """
  INSERT INTO Athlete (firstname, lastname, dateOfBirth)
  VALUES (${data.first}, ${data.last}, ${data.birth})
"""                                                                   //#B
assert keys[0] == [1]                                                 //#1

def insertSql = '''
  INSERT INTO Athlete (firstname, lastname, dateOfBirth)
  VALUES (?,?,?)
'''
def params = ['Ronaldo', 'da Costa', '1970-06-07']
def keyColumnNames = ['ATHLETEID']
keys = sql.executeInsert insertSql, params, keyColumnNames            //#C assert keys[0] == [ATHLETEID: 2]                                      //#2

sql.close()
