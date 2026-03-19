package com.hamitmizrak.course_1;

public class _10_0_String {

    static void main() {
        String vocabulary=" Javase öğreniyorum Javase ";
        vocabulary=vocabulary.trim();

        System.out.println("Length: "+vocabulary.length());
        System.out.println("Length: "+vocabulary.trim().length());

        System.out.println("BÜYÜK: "+vocabulary.toUpperCase());
        System.out.println("küçük: "+vocabulary.toLowerCase());

        System.out.println("başla ?: "+vocabulary.startsWith("Javase"));
        System.out.println("bitti ?: "+vocabulary.endsWith("Javase"));

        System.out.println("Eklendi: "+vocabulary.concat(".eklendi(1)").concat(".eklendi(2)"));

        // indexOf,charAt,substring yapıları saymaya sıfırdan(0)

        System.out.println("başta var mı ?"+vocabulary.indexOf("Javase"));
        System.out.println("sonda var mı"+vocabulary.lastIndexOf("Javase"));

        System.out.println("eşit mi? "+vocabulary.equals("Javase öğreniyorum Javase"));
        System.out.println("Herhangi bir data var mı? "+(vocabulary.isEmpty()));

        System.out.println("bana indisi ver: "+(vocabulary.charAt(0)));

        System.out.println("süpür: "+(vocabulary.substring(1)));
        System.out.println("süpür: "+(vocabulary.substring(1,8))); // 1<=DATA<=8-1

        System.out.println("değiştir: "+(vocabulary.replace("Javase","JavaMe")));

        String  data= vocabulary.toString();

    }

}
