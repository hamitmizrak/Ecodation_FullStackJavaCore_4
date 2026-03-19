package com.hamitmizrak.oop._3_interface;

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

    @Override
    public void delete() {
        System.out.println("Teacher Update: ");
    }

    @Override
    public void list() {
        System.out.println("Teacher Update: ");
    }

    @Override
    public void update() {
        System.out.println("Teacher Update: ");
    }

    @Override
    public void create() {
        System.out.println("Teacher Update: ");
    }
} //end Teacher
