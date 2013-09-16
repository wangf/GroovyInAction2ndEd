import groovy.transform.Synchronized

class Person {
    List addresses

    @Synchronized
    void setAddresses(List addresses) {
        this.addresses.clear()
        this.addresses.addAll(addresses)
    }
}
