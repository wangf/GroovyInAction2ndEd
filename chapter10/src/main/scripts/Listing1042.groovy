/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens (m86014)
 * Create Date: 2/15/15
 */
import groovy.transform.CompileStatic

static String prettify(String s) { "String: $s" }

static String prettify(Date d) { "Date: ${d.time}" }

@CompileStatic
void test() {
    def var = "I'm a String"           //#1
    println prettify(var)              //#2
}

test()
