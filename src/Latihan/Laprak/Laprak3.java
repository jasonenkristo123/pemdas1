package Latihan.Laprak;

import java.util.Scanner;
public class Laprak3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class volume {
    public static void main(String[] args) {
        boolean kodeValid = true;
        float pi = 22/7;

        System.out.println("MEMU");
        System.out.println("0. KELUAR");
        System.out.println("1. HITUNG VOLUME BALOK");
        System.out.println("2. HITUNG VOLUME BOLA");
        System.out.println("3. HITUNG VOLUME KERUCUT");
        System.out.println("4. HITUNG VOLUME SILINDER");
        System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");

        while (kodeValid) {
            Scanner input = new Scanner(System.in);

            System.out.print("MASUKKAN PILIHAN ANDA: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Menghitung Volume Balok");
                    System.out.println("Masukkan panjang: ");
                    float panjang = input.nextFloat();
                    
                    System.out.println("Masukkan lebar: ");
                    float lebar = input.nextFloat();

                    System.out.println("Masukkan tinggi: ");
                    float tinggiBalok = input.nextFloat();

                    float volumeBalok = panjang * lebar * tinggiBalok;
                    System.out.println("Volume Balok: " + volumeBalok);
                break;
                case 2: 
                    System.out.println("Menghitung Volume Bola");
                    System.out.println("Masukkan jari-jari: ");
                    float jariBola = input.nextFloat();

                    float volumeBola = (4f / 3f) * pi * jariBola * jariBola * jariBola;
                    System.out.println("Volume Bola: " + volumeBola);
                break;
                case 3: 
                    System.out.println("Menghitung Volume Kerucut");
                    System.out.println("Masukkan jari-jari: ");
                    float jarikerucut = input.nextFloat();
                    
                    System.out.println("Masukkan tinggi: ");
                    float tinggikerucut = input.nextFloat();

                    float volumeKerucut = (1f / 3f) * pi * jarikerucut * jarikerucut * tinggikerucut;
                    System.out.println("Volume Kerucut: " + volumeKerucut);
                break;
                case 4:
                    System.out.println("Menghitung Volume Silinder");
                    System.out.println("Masukkan jari-jari: ");
                    float jarisilinder = input.nextFloat();
                    
                    System.out.println("Masukkan tinggi: ");
                    float tinggisilinder = input.nextFloat();

                    float volumeSilinder = pi * jarisilinder * jarisilinder * tinggisilinder;
                    System.out.println("Volume Silinder: " + volumeSilinder);
                break;
                case 5:
                    System.out.println("Menghitung Volume Limas Segitiga");
                    System.out.println("Masukkan alas segitiga: ");
                    float alas = input.nextFloat();
                    
                    System.out.println("Masukkan tinggi segitiga: ");
                    float tinggisegitiga = input.nextFloat();
                    
                    System.out.println("Masukkan tinggi limas: ");
                    float tinggiLimas = input.nextFloat();
                    float alasSegitiga = (1f / 2f) * alas * tinggisegitiga;
                    float volumeLimas = (1f / 3f) * alasSegitiga * tinggiLimas;
                    System.out.println("Volume Limas Segitiga: " + volumeLimas);
                break;
                case 0:
                    System.out.println("Program selesai terimakasih");
                    kodeValid = false;
                    break;
                default:
                    System.out.println("kode tidak valid");
            }  
        }
    }
}