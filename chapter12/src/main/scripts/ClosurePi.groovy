/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */
samples = 4

def domain(yield) {
    step = Math.PI * 2 / samples
    (0..samples).each { yield it * step }
}

//Printing the x values would be as simple as invoking
domain { println it }
