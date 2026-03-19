package com.hamitmizrak.course_1;

import java.util.Scanner;

// Mathematics
// static düzenlidir
public class _06_4_Scanner {

    static void main() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String name=scanner.nextLine();
        System.out.println("Girdiğiniz ad: "+name);

        System.out.println("\nLütfen bir sayı giriniz");
        int number= scanner.nextInt();
        System.out.println("Girdiğiniz sayı: "+number);

    }
}
