import v02.model.Robot

abstract class RobotBaseScriptClass extends Script {
    @Delegate @Lazy Robot robot = this.binding.robot
}

