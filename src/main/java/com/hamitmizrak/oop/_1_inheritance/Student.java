package com.hamitmizrak.oop._1_inheritance;

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
} //end Student
