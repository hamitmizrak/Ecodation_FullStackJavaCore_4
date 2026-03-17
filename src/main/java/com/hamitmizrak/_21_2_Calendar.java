package com.hamitmizrak;

import java.util.Calendar;

public class _21_2_Calendar {

    static void main() {
        Calendar calendar= Calendar.getInstance();

        // GET
        System.out.println("Yıl: "+calendar.get(Calendar.YEAR));
        System.out.println("Ay: "+calendar.get(Calendar.MONTH));
        System.out.println("Minute: "+calendar.get(Calendar.MINUTE));

        //SET
        calendar.set(Calendar.YEAR,2024) ;
        System.out.println("Yıl: "+calendar.get(Calendar.YEAR));
    }
}
