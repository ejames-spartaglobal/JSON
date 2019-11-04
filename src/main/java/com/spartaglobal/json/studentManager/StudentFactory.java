package com.spartaglobal.json.studentManager;


public class StudentFactory {

    private String firstName;
    private String lastName;
    private String degree;
    private int age;

    public StudentFactory( String firstName, String lastName, String degree, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    public int getAge() {
        return age;
    }
}
