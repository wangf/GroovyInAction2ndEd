package com.manning.groovyinaction.javaconfig

import com.manning.groovyinaction.Circle
import com.manning.groovyinaction.MaxPerimeterInfo
import com.manning.groovyinaction.Shape
import com.manning.groovyinaction.ShapeInfo
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-08-25
 */
@Configuration
class BeansConfig {

    @Bean
    ShapeInfo maxPerimeterInfo() {
        return new MaxPerimeterInfo()
    }

    @Bean
    Shape circle() {
        def shape = new Circle(size: 4)
        shape.color = "black"
        shape
    }
}
