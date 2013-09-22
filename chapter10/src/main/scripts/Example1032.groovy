import groovy.transform.CompileStatic

static String prettify(Object o) { "Value: ${o.toString()}" }

//static String prettify(String s) { "String: $s" }
//
//static String prettify(Date d) { "Date: ${d.time}" }

//static String prettify(String s) { "String: $s" }
//
//static String prettify(Date d) { "Date: ${d.time}" }
//
//def var = "I’m a String"
//prettify(var)


static String prettify(String s) { "String: $s" }

static String prettify(Date d) { "Date: ${d.time}" }

@CompileStatic
void test() {
    def var = "I’m a String" //# 1
    println prettify(var) //# 2
}

test()
