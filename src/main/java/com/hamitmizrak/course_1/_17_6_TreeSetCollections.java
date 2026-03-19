package com.hamitmizrak.course_1;

import java.util.Set;
import java.util.TreeSet;

/*
* Array=> Eleman sayısı bellidir
* Colllection: Sayısı belli değildir

* java.util.List;
* SET: HLT
* HashSet, LinkedHashSet, TreeSet
* set: interface
* Buradaki generics yapılar için Wrapper class kullanıyoruz yani primitive kullanma
* List: Tekrarlı veya Tekrarsız veri
* Set: Tekrarsız veri
* HashSet: Eklediğiniz sırada gelmeyebilir.
* LinkedHashSet: Eklediğiniz sırada gelecektir.
* TreeSet: Tekrarsız ve küçükten büyüğe doğru
*
* */

public class _17_6_TreeSetCollections {

    private static Set<String> dataList(){
        Set<String> city= new TreeSet<>();
        city.add("Elazığ");
        city.add("Malatya");
        city.add("Ankara");
        city.add("İstanbul");
        city.add("İstanbul");
        city.add("İzmir");
        city.add("İstanbul");

        // Göstermek
        for (String temp:city) {
            System.out.println(temp);
        }

        return city;
    }


    private static void listValue(){
        Set<String> city=dataList();

        // Elemenı getir
        System.out.println("Kaç elemanlı? "+city.size());
        System.out.println("String'e? "+city.toString());

        // Saymaya sıfırdan başlar
        System.out.println("Var mı ? "+city.contains("İzmir"));

        System.out.println();
        // Komple Listeden kaldır
        //city.clear();

        System.out.println("Hashcode "+city.hashCode());
    }

    static void main() {
        dataList();
        //listValue();
    }

}

// Salı - Perşembe
// 09:00 - 13:00