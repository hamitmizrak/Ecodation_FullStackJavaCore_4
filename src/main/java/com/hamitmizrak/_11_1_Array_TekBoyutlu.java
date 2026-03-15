package com.hamitmizrak;

import java.util.Arrays;

public class _11_1_Array_TekBoyutlu {

    static void main() {
        String[] city= new  String[5];
        city[0]="Malatya";
        city[1]="Elazığ";
        city[2]="Bingöl";
        city[3]="Bitlis";
        city[4]="Van";

        String[] city2=city.clone();

        System.out.println("Elaman sayısı: "+city2.length);
        System.out.println("İlk eleman: "+city2[0]);
        System.out.println("Son eleman: "+city2[4]);
        //System.out.println("Son eleman: "+city2[city2.length-1]);
        System.out.println("Hash code: "+city2.hashCode());

        // 1-) Döngü
        for (int i = 0; i <city.length ; i++) {
            System.out.print(city2[i]+" ");
        }

        System.out.println("\n");
        // Sıralama
        Arrays.sort(city2);

        // 2-) isimsel olarak for-each
        for (String temp : city2){
            System.out.print(temp+" ");
        }

    }
}
