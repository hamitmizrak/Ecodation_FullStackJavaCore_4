package com.hamitmizrak;


import java.time.LocalDateTime;
import java.util.Locale;

public class _21_3_LocalDateTime {

    static void main() {
        LocalDateTime now= LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        System.out.println("\n"+SpecialColor.PURPLE+  "Değiştirilmiş tarih"+SpecialColor.RESET);
        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime now3= now2.withDayOfMonth(11).withMonth(12).withYear(2029).withHour(14).withMinute(23).withSecond(59);
        System.out.println(now3);

    }
}


// Salı - Perşembe
// 09:00 - 13:00