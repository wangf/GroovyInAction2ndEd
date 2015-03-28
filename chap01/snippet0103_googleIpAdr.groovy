//Groovy in Action, 2nd Ed.

InetAddress.getAllByName("google.com").collect {
    it.toString().split('/')[1]
}
