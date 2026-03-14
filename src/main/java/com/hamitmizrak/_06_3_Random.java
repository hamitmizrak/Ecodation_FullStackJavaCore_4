package com.hamitmizrak;

import java.util.Random;

// Mathematics
// static düzenlidir
public class _06_3_Random {

    static void main() {
        System.out.println(Math.random() * 3 + 1);
        System.out.println(Math.floor(Math.random() * 3 + 1)); // 1<=SAYI<=3

        Random random= new Random();
        int number=random.nextInt(3)+1;
        System.out.println(number);

    }
}
