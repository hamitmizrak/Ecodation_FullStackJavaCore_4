package com.hamitmizrak;

import java.util.Scanner;

/*
 * Kullanıcıdan Öğrenci sayısını alalım.
 * Her öğrenci için isim ve not alınır.
 * Ortalama hersaplanır
 * En yüksek notu bulunur.
 *
 * İpucu: Scanner, String[], conditional, for v.s
 * */
public class _12_0_Examples {
    // Field
    public static Scanner scanner = new Scanner(System.in);

    // Öğrenci sayısı
    private static int chooiseNumber() {
        System.out.print("Kaç öğrenci gireceksiniz :");
        int number = scanner.nextInt();
        // int => String
        scanner.nextLine();
        return number;
    }

    // Ortalama
    private static double calculateAverage(int[] notes) {
        int sum = 0;

        for (int i = 0; i < notes.length; i++) {
            //sum=sum+notes[i];
            sum += notes[i];
        }
        double result = (double) sum / notes.length;
        return result;
    }

    // En yüksek Not
    private static int findMax(int[] notes) {
        int max = notes[0];
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }

    private static void allResult() {

        // Öğrenci Sayısı
        int number = chooiseNumber();
        String[] names = new String[number];
        int[] notes = new int[number];

        // Öğrenci sayısına göre isim,not
        for (int i = 0; i < number; i++) {
            System.out.print("\nÖğrenci adı: ");
            names[i] = scanner.nextLine();

            System.out.print("Öğrenci notu: ");
            notes[i] = scanner.nextInt();
            // ilk satıra geçmeden diğer satırda başlamak
            scanner.nextLine();
        }

        double avg = calculateAverage(notes);
        System.out.println("\nOrtalama: " + avg);

        int max = findMax(notes);
        System.out.println("En yüksek not: " + max);

        // Başarı/Başarısız
        if (avg >= 60) {
            System.out.println("Sınıf başarılı");
        } else {
            System.out.println("Sınıf başarısız");
        }
    }


    // PSVM
    static void main() {
        allResult();
    } //end psvm

} //end class

// Pazartesi-Salı-Çarşamba-Perşembe
