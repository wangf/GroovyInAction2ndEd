import groovy.sql.Sql

db = Sql.newInstance(
        'jdbc:h2:mem:GinA',
        'sa',
        '',
        'org.h2.Driver')

println db.toString()
println db.properties
println db.connection.metaData.databaseMajorVersion
println db.connection.metaData.databaseMinorVersion


