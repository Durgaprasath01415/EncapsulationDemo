package org.encapsulation;

public class Person {
    private double id;
    private String name;

    public Person(double id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Person() {
        id = Math.random();
        sayHello();
    }

    private void sayHello() {
        System.out.println("Hello - " + getId());
    }

    public double getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
