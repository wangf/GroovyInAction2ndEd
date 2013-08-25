package com.manning.groovyinaction;

import groovy.lang.GroovyShell;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class HelloIntegrationWorldTest {

    @Test
    public void verifyResult() {
        GroovyShell shell = new GroovyShell();
        Object result = shell.evaluate("12+23");

        assertThat(result, notNullValue());
        assertThat(result, instanceOf(Integer.class));
        assertThat(result.toString(), equalTo("35"));
    }
}
