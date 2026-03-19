package com.hamitmizrak.course_1.oop._3_interface;

import lombok.Getter;
import lombok.Setter;

// LOMBOK
@Getter
@Setter
public class Student extends Person {

    // Field
    private String classCode;

    public Student() {
    }

    public Student(String name, String surname, String password, String emailAddress) {
        super(name, surname, password, emailAddress);
    }

    public Student(String name, String surname, String password, String emailAddress, String classCode) {
        super(name, surname, password, emailAddress);
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classCode='" + classCode + '\'' +
                "} " + super.toString();
    }

    @Override
    public void delete() {
        System.out.println("Student Update: ");
    }

    @Override
    public void list() {
        System.out.println("Student Update: ");
    }

    @Override
    public void update() {
        System.out.println("Student Update: ");
    }

    @Override
    public void create() {
        System.out.println("Student Update: ");
    }
} //end Student
