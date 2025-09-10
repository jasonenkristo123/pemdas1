package Latihan.Tugas;

import java.util.Scanner;
// membuat program menggunakan metode switch case
public class Laprak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");

        System.out.print("Pilihan anda: ");
        int pilihan = Integer.parseInt(input.nextLine());

        switch (pilihan) {
            case 1 -> {
                System.out.println("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.println("Masukkan lebar: ");
                double lebar = input.nextDouble();

                double luas = panjang * lebar;
                double keliling = 2 * (panjang + lebar);

                System.out.println("luas persegi panjang adalah      : " + luas + "cm2");
                System.out.println("keliling persegi panjang adalah: " + keliling + "cm");
            }
            case 2 -> {
                System.out.println("Masukkan jari-jari: ");
                double jari = input.nextDouble();
                double pi = Math.PI;

                double luas = pi * jari * jari;
                double keliling = 2 * pi * jari;

                System.out.println("Luas lingkaran adalah: " + luas);
                System.out.println("Keliling lingkaran adalah: " + keliling);
            }
            case 3 -> {
                System.out.println("Masukkan a: ");
                int a = input.nextInt();
                System.out.println("Masukkan b: ");
                int b = input.nextInt();
                System.out.println("Masukkan r: ");
                int r = input.nextInt();

                double luas = 0.5 * a * b;
                double keliling = a + b + r;

                System.out.println("Keliling segitiga   : " + keliling + " cm");
                System.out.println("Luas segitiga       : " + luas + " cm2");
            }
            default -> System.out.println("Data tidak ditemukan, program dihentikan ...");
        }
        input.close(); // input harus di bawahnya print atau di block sendiri kalau tidak menimbulkan eror
    }
}
