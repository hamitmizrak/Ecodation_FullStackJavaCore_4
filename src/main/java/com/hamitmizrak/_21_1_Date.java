package com.hamitmizrak;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _21_1_Date {

    public static void dateFormateMethod(){
        Date now= new Date();
        System.out.println(now);

        Locale locale= new Locale("tr","TR");
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss zzzz",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss zzzz",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzzz",locale); // Digital saat
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss zzzz",locale); // Analog saat
        String formatted= simpleDateFormat.format(now);
        System.out.println(formatted);
    }

    public static void allData(){
        Date date= new Date();
        System.out.println("şu andaki zaman: "+date);
        System.out.println("1 ocak 1970: "+date.getTime());
        System.out.println("yıl: "+(date.getYear()+1900));
        System.out.println("ay: "+(date.getMonth())); // Mart: saymaya sıfırdan başla
        System.out.println("saat: "+(date.getHours()));
        System.out.println("dakika: "+(date.getMinutes()));
        System.out.println("saniye: "+(date.getSeconds()));

        System.out.println("");
        date.setYear(120);
        System.out.println("yıl: "+(date.getYear()+1900));

    }

    static void main() {
        //dateFormateMethod();
        allData();
    }

}
