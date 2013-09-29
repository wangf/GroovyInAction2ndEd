import com.manning.groovyinaction.DebugBuilder

builder = new DebugBuilder(result: new PrintWriter(System.out))
//…
builder.result.flush()
