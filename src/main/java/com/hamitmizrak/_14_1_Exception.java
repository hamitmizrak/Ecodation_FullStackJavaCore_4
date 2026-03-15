package com.hamitmizrak;

import java.io.IOException;
import java.util.Scanner;

// try-catch-throw-throws-finally
public class _14_1_Exception {

    static void main() throws ArithmeticException, IOException,ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int data = scanner.nextInt();

        System.out.println("İlk satır");

        try {
            int number = 3 / data;
            System.out.println(number);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
        System.out.println("Son satır");
    }

}

