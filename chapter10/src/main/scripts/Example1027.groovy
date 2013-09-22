import groovy.transform.TypeChecked

@TypeChecked
def captureOfALocalVariable() {
    def msg = 'Hello'        //#1
    def cl = { msg = 'Hi!' }    //#2
    assert msg == 'Hello'
    cl()                //#3
    assert msg == 'Hi!'
}
