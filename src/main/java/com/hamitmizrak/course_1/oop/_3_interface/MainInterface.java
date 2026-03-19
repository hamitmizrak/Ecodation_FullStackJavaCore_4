package com.hamitmizrak.course_1.oop._3_interface;

import java.util.UUID;

public class MainInterface {

    static void main() {

        Person person= new Person();  // instance (+)
        //Person person= new Student(); // polymorhism
        person.setName("person-1 adı");
        person.setSurname("person-1 soyadı");
        person.setPassword("person"+ UUID.randomUUID().toString());
        person.setEmailAddress("person@gmail.com");
        System.out.println(person);
        person.fullName();
        person.create();
        person.update();
        person.delete();
        person.list();

        System.out.println("*************************");

        Student student= new Student();
        student.setName("Öğrenci-1 adı");
        student.setSurname("Öğrenci-1 soyadı");
        student.setPassword("öğrenci"+ UUID.randomUUID().toString());
        student.setEmailAddress("ogrenci@gmail.com");
        student.setClassCode("A1-102");
        System.out.println(student);
        student.fullName();
        student.create();
        student.update();
        student.delete();
        student.list();

        System.out.println("*************************");

        Teacher teacher= new Teacher();
        teacher.setName("Öğretmen-1 adı");
        teacher.setSurname("Öğretmen-1 soyadı");
        teacher.setPassword("Öğretmen"+ UUID.randomUUID().toString());
        teacher.setEmailAddress("teacher@gmail.com");
        teacher.setPrice("1000TL");
        System.out.println(teacher);
        teacher.fullName();
        teacher.create();
        teacher.update();
        teacher.delete();
        teacher.list();

    }
}
