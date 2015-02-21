package regina;

import com.manning.groovyinaction.MaxPerimeterInfo;
import com.manning.groovyinaction.Shape;
import com.manning.groovyinaction.ShapeInfo;
import com.manning.groovyinaction.Square;
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
            Shape c = ctx.getBean("circle", Shape.class);
            ShapeInfo info = ctx.getBean("maxareainfo", ShapeInfo.class);
            info.displayInfo(s, c);
            new MaxPerimeterInfo().displayInfo(s, c);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
        }

    }
}
