package examples

import org.codehaus.groovy.transform.GroovyASTTransformationClass

/**
 * Chapter 09
 * Section 9.2.7
 * Listing 9.25
 */
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(classes = [MainTransformation])
public @interface Main {}
