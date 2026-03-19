package com.hamitmizrak.course_1.oop._1_inheritance;

import com.hamitmizrak.course_1.SpecialColor;
import lombok.*;

// Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    // Field
    private String name;
    private String surname;
    private String password;
    private String emailAddress;

    // fullName
    public void fullName(){
        System.out.println(SpecialColor.YELLOW+"fullname: "+this.name+" "+this.surname+SpecialColor.RESET);
    }
} //end Person
