import groovy.transform.TypeChecked

def returnDateAndNotTypeChecked() { new Date() }        //#1

@TypeChecked
def returnDateAndTypeChecked() { new Date() }        //#2

@TypeChecked
def usesDate() {
    Date d = returnDateAndTypeChecked()            //#3
    Date d2 = returnDateAndNotTypeChecked()        //#4
}
