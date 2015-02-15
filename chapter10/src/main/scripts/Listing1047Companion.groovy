import groovy.sql.Sql
import groovy.transform.TypeChecked

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */

@TypeChecked(extensions = 'Listing1047.groovy')
findAthletes(Sql sql) {
    sql.eachRow('select * frm Athlete') { row -> println row }       //#A
}
