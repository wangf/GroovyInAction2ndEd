import groovy.transform.TypeChecked

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
class A {
    void foo() {}
}

class B extends A {
    void bar() {}
}

@TypeChecked
void main() {
    def var = new A()
    def cl = { var = new B() }
    cl()
    var.foo()
}

main()
