/*
 * Copyright (c) 2015. Confidential, unpublished property of CIGNA.
 * Do not duplicate or distribute. Use and distribution limited solely to authorized personnel.
 */

trait HasId { //#1
    long id
}

trait HasVersion {
    long version
}

trait Persistent {
    boolean save() { println "saving ${this.dump()}" }
}

trait Entity implements Persistent, HasId, HasVersion { //#2
    boolean save() {
        version++
        Persistent.super.save() //#3
    }
}

class Publication {
    String title
}

class Book extends Publication {
    String isbn
}

Entity gina = new Book(title:"gina", isbn:"111111") as Entity
gina.id = 1
gina.version = 13

assert gina.version == 13

