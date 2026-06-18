package com.syannadhan;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator Hipotek");

        System.out.print("Pinjaman: ");
        int pinjaman = scanner.nextInt();
        System.out.print("Suku Bunga Tahunan: ");
        float sukuBunga = scanner.nextFloat();
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