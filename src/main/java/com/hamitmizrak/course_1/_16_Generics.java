package com.hamitmizrak.course_1;

public class _16_Generics<T> {

    // Field
    private T password;
    private String name;

    // ctor
    public _16_Generics() {
    }

    public _16_Generics(T number, String name) {
        this.password = number;
        this.name = name;
    }

    // Method
      public <A> void   fullSchoolName(String schoolName,A schoolNumber){
        System.out.println(schoolName+" "+schoolNumber);
    }

    // Getter/Setter
    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void main() {
        _16_Generics examples= new _16_Generics();
        examples.setName("Hamit");
        //examples.setPassword(44); // buradaki sayı bileşeni, String olabilir, sayıda olabilir
        //examples.setPassword(44.23);
        //examples.setPassword("Merhabalar");
        examples.setPassword("44Axd");
        System.out.println(examples.getName()+" "+examples.getPassword());

        examples.fullSchoolName("İstanbul Lisesi",35212);
        examples.fullSchoolName("İstanbul Lisesi","35212sxd");

    }
}


// Salı - Perşembe
// 09:00 - 13:00