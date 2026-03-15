package com.hamitmizrak;

// POJO: Plain Old Java Object
public class _13_0_Class_Pojo {

    // Field
    private String name;
    private String surname;

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
        _13_0_Class_Pojo data= new _13_0_Class_Pojo();
        data.setName("Hamit");
        data.setSurname("Mızrak");
        System.out.println(data.getName()+" "+data.getSurname());
    }
}
