package com.hamitmizrak;

// POJO: Plain Old Java Object
public class _13_1_Class_Pojo_Ctor {

    // Field
    private String name;
    private String surname;

    // Constructor (Kurucu metot)
    // Overloading
    public _13_1_Class_Pojo_Ctor(){}

    // parametreli constructor
    public _13_1_Class_Pojo_Ctor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // PSVM
    static void main() {
        // instance
        _13_1_Class_Pojo_Ctor data= new _13_1_Class_Pojo_Ctor();
        data.setName("Hamit");
        data.setSurname("Mızrak");
        System.out.println(data.getName()+" "+data.getSurname());

        _13_1_Class_Pojo_Ctor data2= new _13_1_Class_Pojo_Ctor("Hamit","Mızrak");
        System.out.println(data2.getName()+" "+data2.getSurname());
    }
}
