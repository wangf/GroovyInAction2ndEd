package com.manning.groovyinaction;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.io.File;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class GroovyClassLoaderExample {

    public static void main(String[] args) {
        load();
    }

    public static void load() {
        try {
            GroovyClassLoader gcl = new GroovyClassLoader();
            Class greetingClass = gcl.parseClass(new File("src/main/scripts/Hello.groovy"));
            GroovyObject hello = (GroovyObject) greetingClass.newInstance();
            Object[] args = {};
            assert "Hello!".equals(hello.invokeMethod("greeting", args));
        } catch (Exception ignored) {
        }

    }
}
