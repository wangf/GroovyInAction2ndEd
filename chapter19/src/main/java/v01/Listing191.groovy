package v01

import static v01.Direction.left

//#2

enum Direction {                         //#1
    left, right, forward, backward         //#1
}                                        //#1

class Robot {                            //#3
    void move(Direction dir) {             //#4
        println "robot moved $dir"           //#4
    }                                      //#4
}

def robot = new Robot()                  //#5

robot.move left                          //#6
