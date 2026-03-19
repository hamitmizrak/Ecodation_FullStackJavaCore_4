package com.hamitmizrak.course_1.oop._1_inheritance;

import lombok.Getter;
import lombok.Setter;

// LOMBOK
@Getter
@Setter
public class Teacher  extends Person {

    // Field
    private String price;

    public Teacher() {
    }

    public Teacher(String name, String surname, String password, String emailAddress) {
        super(name, surname, password, emailAddress);
    }

    public Teacher(String name, String surname, String password, String emailAddress, String price) {
        super(name, surname, password, emailAddress);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "price='" + price + '\'' +
                "} " + super.toString();
    }
} //end Teacher
