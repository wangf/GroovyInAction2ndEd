/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
import util.DbUtil

def sql = DbUtil.create()
DbUtil.populate(sql)

def dump(sql, tablename) {
    println " CONTENT OF TABLE ${tablename} ".center(32, '-')
    sql.eachRow('SELECT * FROM ' + tablename) { rs ->
        def meta = rs.getMetaData()
        if (meta.columnCount <= 0) return
        for (i in 0..<meta.columnCount) {
            print "${i}: ${meta.getColumnLabel(i + 1)}".padRight(20)        //#1
            println rs[i]?.toString()                                       //#2
        }
        println '-' * 32
    }
}

def baos = new ByteArrayOutputStream()
System.setOut(new PrintStream(baos))                                  //#3

dump(sql, 'Athlete')
assert baos.toString().readLines()*.trim().join('\n') == '''\
--- CONTENT OF TABLE Athlete ---
0: ATHLETEID        0
1: FIRSTNAME        Paul
2: LASTNAME         Tergat
3: DATEOFBIRTH      1969-06-17
--------------------------------
0: ATHLETEID        1
1: FIRSTNAME        Khalid
2: LASTNAME         Khannouchi
3: DATEOFBIRTH      1971-12-22
--------------------------------
0: ATHLETEID        2
1: FIRSTNAME        Ronaldo
2: LASTNAME         da Costa
3: DATEOFBIRTH      1970-06-07
--------------------------------\
'''
