/**
 * Chapter 09
 * Section 9.2.5
 * Listing 9.21
 */
class Person implements Externalizable {
    String firstName, lastName
    Date birthday

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(firstName)
        out.writeObject(lastName)
        out.writeObject(birthday)
    }

    public void readExternal(ObjectInput oin) {
        firstName = oin.readObject()
        lastName = oin.readObject()
        birthday = oin.readObject()
    }
}

