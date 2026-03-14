package com.hamitmizrak;

public class _05_Cast {
    static void main() {
        String data1="44";
        int data2=16;

        // toplama
        // System.out.println(data2+14);
        //System.out.println(data2+data1);

        // Cast: Dönüştürme (String -> Integer)
        int data3=Integer.valueOf(data1);
        System.out.println(data2+data3);


        // Cast: (Integer -> String)
        int data4=16;
        String data5=String.valueOf(data4);
        System.out.println(data5+24);
    }
}
