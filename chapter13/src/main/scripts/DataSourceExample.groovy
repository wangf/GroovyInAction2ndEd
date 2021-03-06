import ch.qos.logback.classic.Level

def source = new org.h2.jdbcx.JdbcDataSource()
source.with {
    setURL 'jdbc:h2:mem:GinA'
    setUser 'sa'
    setPassword ''
}
def db = new groovy.sql.Sql(source)
println db.properties
//Logger.getLogger('groovy.sql').level = Level.FINE
//db.execute '''
//    CREATE TABLE Athlete (
//        firstname   VARCHAR(64),
//        lastname    VARCHAR(64),
//        dateOfBirth DATE
//    );
//'''

//
//db.execute '''
//    CREATE TABLE Athlete (
//        athleteId   INTEGER GENERATED BY DEFAULT AS IDENTITY,
//        firstname   VARCHAR(64),
//        lastname    VARCHAR(64),
//        dateOfBirth DATE
//    );
//    CREATE INDEX athleteIdx ON Athlete (athleteId);
//'''

db.execute '''
    DROP   INDEX athleteIdx IF EXISTS;
    DROP   TABLE Athlete    IF EXISTS;
    CREATE TABLE Athlete (
        athleteId   INTEGER GENERATED BY DEFAULT AS IDENTITY,
        firstname   VARCHAR(64),
        lastname    VARCHAR(64),
        dateOfBirth DATE
    );
    CREATE INDEX athleteIdx ON Athlete (athleteId);
'''

//db.execute '''
//    INSERT INTO Athlete (firstname, lastname,     dateOfBirth)
//                 VALUES ('Paul',    'Tergat',     '1969-06-17');
//    INSERT INTO Athlete (firstname, lastname,     dateOfBirth)
//                 VALUES ('Khalid',  'Khannouchi', '1971-12-22');
//    INSERT INTO Athlete (firstname, lastname,     dateOfBirth)
//                 VALUES ('Ronaldo', 'da Costa',   '1970-06-07');
//'''

String athleteInsert = '''
    INSERT INTO Athlete (firstname, lastname, dateOfBirth)
                VALUES  (?, ?, ?);
'''
db.execute athleteInsert, ['Paul', 'Tergat', '1969-06-17']
db.execute athleteInsert, ['Khalid', 'Khannouchi', '1971-12-22']
db.execute athleteInsert, ['Ronaldo', 'da Costa', '1970-06-07']


