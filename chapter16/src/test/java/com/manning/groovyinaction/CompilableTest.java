package com.manning.groovyinaction;

import org.codehaus.groovy.jsr223.GroovyScriptEngineImpl;
import org.junit.Test;

import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class CompilableTest {

    @Test
    public void verifyCompilable() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine gEngine = manager.getEngineByName("groovy");
        assertThat(gEngine, allOf(notNullValue(), instanceOf(GroovyScriptEngineImpl.class)));

        GroovyScriptEngineImpl compilable = (GroovyScriptEngineImpl) gEngine;
        compilable.put("name", "Dierk");
        CompiledScript script = compilable.compile("return name");


        Object dierksName = script.eval();
        assertThat(dierksName, allOf(notNullValue(), instanceOf(String.class), hasToString("Dierk")));

        compilable.put("name", "Guillaume");
        Object guillaumesName = script.eval();
        assertThat(guillaumesName, allOf(notNullValue(), instanceOf(String.class), hasToString("Guillaume")));

    }
}
