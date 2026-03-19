package com.hamitmizrak.oop._2_abstract;

import com.hamitmizrak.SpecialColor;
import lombok.*;

// Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
abstract public class Person {

    // Field
    private String name;
    private String surname;
    private String password;
    private String emailAddress;

    // fullName
    public void fullName(){
        System.out.println(SpecialColor.YELLOW+"fullname: "+this.name+" "+this.surname+SpecialColor.RESET);
    }

    abstract public  void generatePassword();
} //end Person
