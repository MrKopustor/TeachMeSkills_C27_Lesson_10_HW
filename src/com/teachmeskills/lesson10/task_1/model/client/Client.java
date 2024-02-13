package com.teachmeskills.lesson10.task_1.model.client;

/**
 * Create class Client.
 * Describe the Class field.
 * Create constructor with class fields.
 * Create getter and setter for class fields.
 */
public class Client {

    private String name;
    private String surname;
    private int age;

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
