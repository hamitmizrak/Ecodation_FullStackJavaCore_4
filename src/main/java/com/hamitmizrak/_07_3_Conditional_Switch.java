package com.hamitmizrak;

public class _07_3_Conditional_Switch {

    static void main() {

        int number = 4;

        switch (number){
            case 1:
                System.out.println("sayı bir");
                break;
            case 2:
                System.out.println("sayı iki");
                break;
            case 3:
                System.out.println("sayı üç");
                break;
            case 4:
                System.out.println("sayı dört");
                break;
            case 5:
                System.out.println("sayı beş");
                break;
            default:
                System.out.println("1<=SAYI<=5 dışında");
                break;
        }

    }
}
