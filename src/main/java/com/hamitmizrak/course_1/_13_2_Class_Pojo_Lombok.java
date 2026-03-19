package com.hamitmizrak.course_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// POJO: Plain Old Java Object
public class _13_2_Class_Pojo_Lombok {

    // Field
    private String name;
    private String surname;

    // Constructor (Kurucu metot)
    // Overloading
    // Getter/Setter
    // PSVM
    static void main() {
        // instance
        _13_2_Class_Pojo_Lombok data= new _13_2_Class_Pojo_Lombok();
        data.setName("Hamit");
        data.setSurname("Mızrak");
        System.out.println(data.getName()+" "+data.getSurname());

        _13_2_Class_Pojo_Lombok data2= new _13_2_Class_Pojo_Lombok("Hamit","Mızrak");
        System.out.println(data2.getName()+" "+data2.getSurname());
    }
}
