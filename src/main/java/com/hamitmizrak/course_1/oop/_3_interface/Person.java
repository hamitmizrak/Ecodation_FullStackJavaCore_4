package com.hamitmizrak.course_1.oop._3_interface;

import com.hamitmizrak.course_1.SpecialColor;
import lombok.*;

// Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements ICrud{

    // Field
    private String name;
    private String surname;
    private String password;
    private String emailAddress;

    // fullName
    public void fullName(){
        System.out.println(SpecialColor.YELLOW+"fullname: "+this.name+" "+this.surname+SpecialColor.RESET);
    }

    @Override
    public void create() {
        System.out.println("Person Create: ");
    }

    @Override
    public void update() {
        System.out.println("Person Update: ");
    }

    @Override
    public void list() {
        System.out.println("Person List: ");
    }

    @Override
    public void delete() {
        System.out.println("Person Delete: ");
    }
} //end Person
