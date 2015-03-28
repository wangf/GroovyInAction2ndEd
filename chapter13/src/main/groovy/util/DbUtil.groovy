package util

import groovy.sql.Sql

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
class DbUtil {

    def static create() {
        def url = 'jdbc:hsqldb:mem:GinA'
        def user = 'sa'
        def password = ''
        def driver = 'org.hsqldb.jdbcDriver'
        def sql = Sql.newInstance(url, user, password, driver)
        sql.execute '''
  CREATE TABLE Athlete (
    athleteId   INTEGER GENERATED BY DEFAULT AS IDENTITY,    --#A
    firstname   VARCHAR(64),
    lastname    VARCHAR(64),
    dateOfBirth DATE
  );
'''
        sql
    }

def static enableLogging(){}



def static insertAthlete(sql, fn, ln, dob){
        sql.execute """
  INSERT INTO Athlete (firstname, lastname, dateOfBirth)
  VALUES (${fn}, ${ln}, ${dob})
"""
    }


    def static populate(sql){
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

    }
}