package com.syannadhan;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator Hipotek");

        int pinjaman = 0;
        float sukuBunga = 0;

        while(true) {
            System.out.print("Pinjaman($1k - $1M): ");
            pinjaman = scanner.nextInt();
            if (pinjaman >= 1000 && pinjaman <= 1_000_000)
                break;
            System.out.println("Masukkan nilai dalam rentang $1k - $1M");
        }

        while (true) {
            System.out.print("Suku Bunga Tahunan: ");
            sukuBunga = scanner.nextFloat();
            if (sukuBunga >= 1 && sukuBunga <= 30)
                break;
            System.out.println("Masukkan suku bunga dalam rentang 1 - 30");
        }

        System.out.print("Periode Pinjaman(Tahun): ");
        int periode = scanner.nextInt();

        System.out.println("\n sedang menghitung ....");
        System.out.println("");

        final float sukuBungaFix = sukuBunga / 100 / 12;
        final float periodeFix = periode * 12;
        double rumus = pinjaman * ((sukuBungaFix * Math.pow((1 + sukuBungaFix), periodeFix))/ (Math.pow((1+sukuBungaFix), periodeFix)-1));

        System.out.println("Pinjaman : $" + pinjaman);
        System.out.println("Suku Bunga: " + sukuBunga + "%");
        System.out.println("Periode: " + periode + " Tahun");
        System.out.print("Total Bayaran: ");

        String Hasil = NumberFormat.getCurrencyInstance().format(rumus);
        System.out.println(Hasil);
    }
}