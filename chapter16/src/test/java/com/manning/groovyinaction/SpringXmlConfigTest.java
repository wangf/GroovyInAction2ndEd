package com.manning.groovyinaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/beans.xml")
public class SpringXmlConfigTest {

    @Autowired
    Shape c;

    @Autowired
    @Qualifier("maxareainfo")
    ShapeInfo info;

    @Test
    public void verifyShapesWireUp() {
        Shape s = new Square(7);
        info.displayInfo(s, c);
        new MaxPerimeterInfo().displayInfo(s, c);
    }
}
