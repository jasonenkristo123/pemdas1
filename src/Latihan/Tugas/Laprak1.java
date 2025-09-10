package Latihan.Tugas;

import java.util.Scanner;
public class Laprak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program menghitung pemakaian listrik sederhana");

        System.out.print("masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Kelurahan: ");
        String kelurahan = input.nextLine();

        System.out.print("Masukkan posisi awal Kwh Meter: ");
        int kwhAwal = input.nextInt();

        System.out.print("Masukkan posisi akhir Kwh Meter: ");
        int kwhAkhir = input.nextInt();

        System.out.print("Masukkan biaya beban saat ini: ");
        int beban = input.nextInt();

        System.out.print("Masukkan PPJ (dalam persen): ");
        float PPJ = input.nextFloat();

        input.close();

        int pemakaian = (kwhAkhir - kwhAwal);
        int tarif = (pemakaian * beban);
        float persen = (tarif * PPJ / 100);
        float total = (tarif + persen);

        System.out.println("=========== PLN Java ==========");
        System.out.printf("%-20s: %s\n", "nama", nama);
        System.out.printf("%-20s: %s\n", "kelurahan", kelurahan);
        System.out.printf("%-20s: %d\n", "Pemakaian bulan ini", pemakaian);
        System.out.printf("%-20s: Rp %d,-%n", "Tarif Listrik", tarif);
        System.out.printf("%-20s: Rp %.0f,-%n", "PPJ " + (int)PPJ + "%", persen);
        System.out.printf("%-20s: Rp %.0f,-%n", "Pemakaian bulan ini", total);
        System.out.println("===============================");
    }
}


class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan operator pertama: ");
        int operator1 = input.nextInt();
        System.out.println("masukkan operator kedua: ");
        int operator2 = input.nextInt();
        input.close();
        int penjumlahan = (operator1 + operator2);
        int pengurangan = (operator1 - operator2);
        int perkalian = (operator1 * operator2);
        float pembagian = (operator1 / operator2);
        

        System.out.println("hasil perjumlahan: " + penjumlahan);
        System.out.println("hasil pengurangan: " + pengurangan);
        System.out.println("hasil perkalian: " + perkalian);
        System.out.println("hasil pembagian: " + pembagian);
    }
}