import groovy.lang.GroovyShell;

public class HelloIntegrationWorld {
    public static void main(String[] args) {
        GroovyShell shell = new GroovyShell();
        Object result = shell.evaluate("12+23");
       // assert 35 == result;
    }
}
