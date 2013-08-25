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
public class ServiceInterfaceTest {

    @Test
    public void verifyInvocableServiceInterface() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine gEngine = manager.getEngineByName("groovy");
        assertThat(gEngine, allOf(notNullValue(), instanceOf(GroovyScriptEngineImpl.class)));

        GroovyScriptEngineImpl invocable = (GroovyScriptEngineImpl) gEngine;
        invocable.eval(getScript());
        BusinessService service = invocable.getInterface(BusinessService.class);
        assertThat(service, allOf(notNullValue(), instanceOf(BusinessService.class)));

        service.init();
        Object result = service.execute(new Object[]{});
        assertThat(result, nullValue());
        service.release();

    }

    String getScript() {
        return "void init() { println \"init\" }\n" +
                "Object execute(Object[] objs) { println \"execute\" }\n" +
                "void release() { println \"release\" }\n";
    }


    interface BusinessService {
        void init();

        Object execute(Object[] parameters);

        void release();
    }

}
