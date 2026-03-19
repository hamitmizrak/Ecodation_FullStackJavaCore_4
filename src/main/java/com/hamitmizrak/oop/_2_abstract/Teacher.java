package com.hamitmizrak.oop._2_abstract;

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
    public void generatePassword() {
        System.out.println("Teacher Şifre oluşturuldu");
    }
} //end Teacher
