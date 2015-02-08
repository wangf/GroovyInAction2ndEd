/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */

def printer = { line -> println line }

def Closure getPrinter() {
    return { line -> println line }
}
