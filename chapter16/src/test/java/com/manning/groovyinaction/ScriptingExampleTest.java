package com.manning.groovyinaction;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ScriptingExampleTest {
    private static final Logger log = LoggerFactory.getLogger(ScriptingExampleTest.class);

    @Test
    public void verifyScriptEval() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine gEngine = manager.getEngineByName("groovy");
        String result = (String) gEngine.eval("'+-----' * 3 + '+'");
        assertThat(result, equalTo(""));
        log.debug("HERE is your result {}", result);
    }
}
