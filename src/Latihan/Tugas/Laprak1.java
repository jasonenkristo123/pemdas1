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

        
    }
}
