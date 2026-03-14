package com.hamitmizrak;

// Method: Veri tekrarını önleyen demektir.
// camelCase isimlendirme yapılır
// isimlendirmede çok çok uzun kelimeler kullanmayız
public class _09_Method {

    // 1- voidliParametresiz
    public static void voidliParametresiz() {
        System.out.println("1- voidli Parametresiz");
    }

    // 2- voidliParametreli
    public static void voidliParametreli(int data) {
        System.out.println("2- voidli Parametreli: " + data);
    }

    // 3- returnParametresiz
    public static String returnParametresiz() {
        return "3- returnlu Parametresiz";
    }

    // 4- returnParametresiz
    public static String returnParametreli(String username, int number, String password) {
        return "4- returnlu Parametreli " + username + " " + password+" "+number;
    }


    // PSVM
    static void main() {
        voidliParametresiz();
        voidliParametreli(44);

        String data3 = returnParametresiz();
        System.out.println(data3);

        String data4 = returnParametreli("Hamit",44,"Mızrak");
        System.out.println(data4);
    }

}
