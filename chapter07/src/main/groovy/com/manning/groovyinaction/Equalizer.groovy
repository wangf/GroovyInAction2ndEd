package com.manning.groovyinaction

public class Equalizer {             // Java 
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Equalizer)) return false;
        Equalizer w = (Equalizer) obj;
        return true;                 // custom logic here
    }
}
