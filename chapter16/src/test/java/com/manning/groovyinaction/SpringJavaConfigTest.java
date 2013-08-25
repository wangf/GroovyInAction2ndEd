package com.manning.groovyinaction;

import com.manning.groovyinaction.javaconfig.BeansConfig;
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
@ContextConfiguration(classes = BeansConfig.class)
public class SpringJavaConfigTest {

    @Autowired
    @Qualifier("circle")
    Shape c;

    @Autowired
    ShapeInfo info;

    @Test
    public void verifyShapesWireUp() {
        Shape s = new Square(7);
        info.displayInfo(s, c);
        new MaxPerimeterInfo().displayInfo(s, c);
    }
}
