package com.manning.groovyinaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
public class GroovyWithSpring {
    public static final Logger logger = LoggerFactory.getLogger(GroovyWithSpring.class);
    
    public static void main(String[] args) {
        try {
            ApplicationContext ctx =
                    new ClassPathXmlApplicationContext("beans.xml");
            Shape s = new Square(7);
            Shape c = (Shape) ctx.getBean("circle");
            ShapeInfo info = (ShapeInfo) ctx.getBean("maxareainfo");
            info.displayInfo(s, c);
            new MaxPerimeterInfo().displayInfo(s, c);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }

    }
}
