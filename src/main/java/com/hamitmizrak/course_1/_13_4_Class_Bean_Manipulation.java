package com.hamitmizrak.course_1;

// Bean= POJO + toString +Method
public class _13_4_Class_Bean_Manipulation {

    // Field
    private String name;
    private String surname;

    // Constructor (Kurucu metot)
    // Overloading
    public _13_4_Class_Bean_Manipulation() {
        this.name="Adınızı giriniz";
        this.surname="Soyadınız giriniz";
    }

    public _13_4_Class_Bean_Manipulation(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "toString{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // Method
    public void fullName(){
        System.out.println("Full Name: "+this.name+" "+surname);
    }


    // Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    // PSVM
    static void main() {
        // instance
        _13_4_Class_Bean_Manipulation data2 = new _13_4_Class_Bean_Manipulation();
        data2.setName("Hamit");
        data2.setSurname("Mızrak");
        System.out.println(data2.getName()+" "+data2.getSurname());
    }
}
