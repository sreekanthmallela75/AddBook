package com.AddBook;

public class Person {
    String name;
    int rollno;
    String address;

    public Person(String name, int rollno, String address ) {
        this.name=name;
        this.rollno=rollno;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", address='" + address + '\'' +
                '}';
    }
}

