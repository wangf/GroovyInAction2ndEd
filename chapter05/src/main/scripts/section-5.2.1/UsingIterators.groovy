import groovy.transform.Canonical

/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/7/15
 */
@Canonical
class ItemType {
    String name
}

List<ItemType> list = [new ItemType(name: 'Chowder'), new ItemType(name: 'Mung Dahl')]


// Java 5
for (ItemType item : list) {
    println "Java 5: ${item}"
    // do something with item
}

// Groovy object iteration
list.each { item ->     println "Grvy: ${item}" /* do something with item */ }

// Java 8 with lambda
//list.stream().forEach( (item) -> {
//    println "Java 8: ${item}"
//    // do something with item
//} );

// Groovy closures with Java 8
list.stream().forEach { println it}
