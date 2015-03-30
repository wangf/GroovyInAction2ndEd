import v02.model.Robot

def robot = new Robot()

robot.with {       //#1
    move left            //#2
    move forward         //#2
}
//#1 Demarcate block where robot will be delegate
//#2 Streamlined syntax available within block
