package com.manning.groovyinaction;

// Java
public class MyJavaBean implements java.io.Serializable {
    private String myprop;

    public String getMyprop() {
        return myprop;
    }

    public void setMyprop(String value) {
        myprop = value;
    }
}
