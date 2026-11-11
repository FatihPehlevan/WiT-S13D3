package org.example;

public class Person {
    String firsName;
    String lastName;
    int age;
    String job;
    String hometown;
    double height;

    public Person (String firsName, String lastName, int age) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String firsName, String lastName, int age, String job, String hometown, double height) {
        this(firsName, lastName, age);
        this.job = job;
        this.hometown = hometown;
        this.height = height;
    }

    public String getFirstName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <19;
    }
}
