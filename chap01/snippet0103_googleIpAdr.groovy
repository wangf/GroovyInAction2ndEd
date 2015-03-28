// [Groovy in Action, Second Edition](http://www.manning.com/koenig2/)

InetAddress.getAllByName("google.com").collect {
    it.toString().split('/')[1]
}
