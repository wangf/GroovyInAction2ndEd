package v02.integration

abstract class CaseRobotBaseScript extends RobotBaseScript {
    def invokeMethod(String name, args) {                           //#1
        getBinding().robot."${name.toLowerCase()}"(*args)             //#2
    }
}
