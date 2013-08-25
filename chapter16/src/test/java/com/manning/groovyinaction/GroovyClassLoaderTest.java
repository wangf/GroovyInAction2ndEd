package com.manning.groovyinaction;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.junit.Test;

import java.io.File;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class GroovyClassLoaderTest {

    @Test
    public void verifyClassLoads() throws Exception {
        GroovyClassLoader gcl = new GroovyClassLoader();
        Class greetingClass = gcl.parseClass(new File("chapter16/src/main/scripts/Hello.groovy"));
        GroovyObject hello = (GroovyObject) greetingClass.newInstance();
        Object[] args = {};
        assert "Hello!".equals(hello.invokeMethod("greeting", args));

    }
}
