package com.hamitmizrak;

import java.util.*;

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
* Map: <K,V> eşlemedir.
*
* */

public class _17_7_HashMapCollections {

    private static Map<Integer,Object> dataList(){
        Map<Integer,Object> city= new HashMap<>();
        city.put(1,"Elazığ");
        city.put(2,"Malatya");
        city.put(3,"Ankara");
        city.put(9,"İstanbul");
        city.put(5,"İstanbul");
        city.put(6,"İzmir");
        city.put(7,"İstanbul");

        // Göstermek
        // KEY
        for (Integer key: city.keySet()){
            System.out.println("key: "+ key);
        }

        // VALUE
        for (Object value: city.values()){
            System.out.println("value: "+ value);
        }

        // 2.YOL KEY - VALUE
        System.out.println("\n2.YOL");
        for (Integer key: city.keySet()){
            System.out.println(key +" ==> " + city.get(key));
        }

        // 3. YOL Iterator
        System.out.println("\n3.YOL");
        Set<Integer> setCity= city.keySet();
        Iterator iterator= setCity.iterator();
        while(iterator.hasNext()){
            System.out.println(city.get(iterator.next()));
        }


        // 4.YOL
        System.out.println("\n4.YOL");
        for(Map.Entry<Integer,Object> temp: city.entrySet()){
            System.out.println(temp);
        }

        return city;
    }


    private static void listValue(){
        Map<Integer,Object> city=dataList();

        // Elemenı getir
        System.out.println("Kaç elemanlı? "+city.size());
        System.out.println("String'e? "+city.toString());

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