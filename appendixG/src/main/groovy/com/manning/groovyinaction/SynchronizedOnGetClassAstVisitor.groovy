package com.manning.groovyinaction

import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.ast.stmt.SynchronizedStatement

/**
 * @author Gordon Dickens (gordonad)
 * @since 2013-09-15
 */

class SynchronizedOnGetClassAstVisitor {
//        extends AbstractAstVisitor {

    void visitSynchronizedStatement(SynchronizedStatement statement) {

        if (statement.expression instanceof MethodCallExpression) {
            def method = statement.expression
            def argumentCount = 0
            if (AstUtil.isMethodNamed(method, 'getClass', argumentCount)) {
                addViolation statement
            }
        }
        super.visitSynchronizedStatement(statement);
    }
}
