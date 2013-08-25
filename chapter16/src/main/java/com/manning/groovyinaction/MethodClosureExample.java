package com.manning.groovyinaction;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.codehaus.groovy.runtime.MethodClosure;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class MethodClosureExample {
    public static void main(String[] args) {
        MethodClosure mclos = null;//new MethodClosure(multiplicator, "multiply");
        Binding binding = new Binding();
        binding.setVariable("multiply", mclos);
        GroovyShell shell = new GroovyShell(binding);
        shell.evaluate("multiply(5, 6)");
    }
}
