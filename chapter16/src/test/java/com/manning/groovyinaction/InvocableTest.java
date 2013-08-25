package com.manning.groovyinaction;

import org.codehaus.groovy.jsr223.GroovyScriptEngineImpl;
import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class InvocableTest {


    @Test
    public void verifyInvocable() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine gEngine = manager.getEngineByName("groovy");
        assertThat(gEngine, allOf(notNullValue(), instanceOf(GroovyScriptEngineImpl.class)));

        GroovyScriptEngineImpl invocable = (GroovyScriptEngineImpl) gEngine;
        invocable.eval("def upper(s) { s.toUpperCase() }");
        Object s = invocable.invokeFunction("upper", "Groovy");

        invocable.eval("def add(a, b) { a + b }");
        invocable.invokeFunction("add", new Integer(1), new Integer(2));

        Object result = invocable.invokeMethod(s, "endsWith", "Y");
        assertThat(result, allOf(instanceOf(Boolean.class), notNullValue(), hasToString("true")));
    }

}
