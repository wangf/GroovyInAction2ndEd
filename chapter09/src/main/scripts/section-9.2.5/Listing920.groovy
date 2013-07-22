/**
 * Chapter 09
 * Section 9.2.5
 * Listing 9.20
 */
Object clone() throws CloneNotSupportedException {
    def baos = new ByteArrayOutputStream()
    baos.withObjectOutputStream { it.writeObject(this) }
    def bais = new ByteArrayInputStream(baos.toByteArray())
    bais.withObjectInputStream(getClass().classLoader) { it.readObject() }
}


