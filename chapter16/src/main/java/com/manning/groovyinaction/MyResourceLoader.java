package com.manning.groovyinaction;

import groovy.lang.GroovyResourceLoader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class MyResourceLoader implements GroovyResourceLoader {
    @Override
    public URL loadGroovySource(final String filename)
            throws MalformedURLException {
        URL url = null; // create the URL pointing at the resource
        return url;
    }
}
