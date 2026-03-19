package com.hamitmizrak.oop._1_inheritance;

import java.util.UUID;

public class MainInheritance {

    static void main() {

        Person person= new Student();
        person.setName("person-1 adı");
        person.setSurname("person-1 soyadı");
        person.setPassword("person"+ UUID.randomUUID().toString());
        person.setEmailAddress("person@gmail.com");
        System.out.println(person);
        person.fullName();

        System.out.println("*************************");

        Student student= new Student();
        student.setName("Öğrenci-1 adı");
        student.setSurname("Öğrenci-1 soyadı");
        student.setPassword("öğrenci"+ UUID.randomUUID().toString());
        student.setEmailAddress("ogrenci@gmail.com");
        student.setClassCode("A1-102");
        System.out.println(student);
        student.fullName();

        System.out.println("*************************");

        Teacher teacher= new Teacher();
        teacher.setName("Öğretmen-1 adı");
        teacher.setSurname("Öğretmen-1 soyadı");
        teacher.setPassword("Öğretmen"+ UUID.randomUUID().toString());
        teacher.setEmailAddress("teacher@gmail.com");
        teacher.setPrice("1000TL");
        System.out.println(teacher);
        teacher.fullName();

    }
}
