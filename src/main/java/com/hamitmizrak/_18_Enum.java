package com.hamitmizrak;

/*
* enum: sir sınıf türüdür
* Enum nesnedir
* Type Safe(Tür güvenliğini sağlamak)
*
*  */

public enum _18_Enum {
PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR;

    static void main() {
        _18_Enum days= _18_Enum.PAZARTESI;
        System.out.println(days);

        // Saymaya sıfırdan başlar
        System.out.println(days.ordinal());

        String data= days.toString();
    }
}

