package com.hamitmizrak.course_1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
* Array=> Eleman sayısı bellidir
* Colllection: Sayısı belli değildir

* java.util.List;
* LIST: LAV
* LinkedList, ArrayList, Vector
* list: interface
* Buradaki generics yapılar için Wrapper class kullanıyoruz yani primitive kullanma
* */

public class _17_1_ArrayListCollections {

    private static List<String>  dataList(){
        //List<String> city= new ArrayList<String>();
        List<String> city= new ArrayList<>();
        city.add("Elazığ");
        city.add("Malatya");
        city.add("Ankara");
        city.add("İstanbul");
        city.add("İstanbul");
        city.add("İzmir");

        // Göstermek
        for (int i = 0; i < city.size() ; i++) {
            System.out.println(city.get(i));
        }

        return city;
    }


    private static void listValue(){
        List<String> city=dataList();

        // Elemenı getir
        System.out.println("Kaç elemanlı? "+city.size());
        System.out.println("String'e? "+city.toString());

        // Saymaya sıfırdan başlar
        System.out.println("İlk elemanlı "+city.get(0));
        System.out.println("İlk elemanlı "+city.getFirst());

        System.out.println("son elemanlı "+city.get(4-1));
        System.out.println("son elemanlı "+city.get(city.size()-1));
        System.out.println("son elemanlı "+city.getLast());

        System.out.println("Var mı ? "+city.contains("İzmir"));

        // Saymaya sıfırdan başlar
        System.out.println("indexOf: "+city.indexOf("İstanbul"));
        System.out.println("lastIndexOf: "+city.lastIndexOf("İstanbul"));

        System.out.println();
        // Komple Listeden kaldır
        //city.clear();

        // Teker teker listeden kaldır
        try{
            System.out.println("İlk elemanlı "+city.getFirst());
            System.out.println("Elemanı listede kaldır: "+city.remove(0));
            System.out.println("Elemanı listede kaldır: "+city.removeFirst());
            System.out.println("İlk elemanlı "+city.getFirst());
        }catch (NoSuchElementException elementException){
            // elementException.printStackTrace();
        }

        System.out.println("Hashcode "+city.hashCode());
    }

    static void main() {
        dataList();
        //listValue();
    }

}

// Salı - Perşembe
// 09:00 - 13:00