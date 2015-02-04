/**
 * Chapter 01 
 * Section 1.3.2
 * Approximate Page 18
 * 04-Feb-2015
 */

/**
 * To run in via 'groovyConsole'
 */
InetAddress.getAllByName("google.com").collect {
    it.toString().split('/')[1]
}

/**
 * To run as groovy script
 */
//InetAddress.getAllByName("google.com").collect {
//   println it.toString().split('/')[1]
//}


