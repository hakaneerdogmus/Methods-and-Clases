package com.hakanerdogmus.methodsandclasses;

public class Musicians {
    String name;
    String insturument;
    int age;

    public Musicians(String name, String insturument, int age) {
        this.name = name;
        this.insturument = insturument;
        this.age = age;
        System.out.println("constructor called");
    }
}
