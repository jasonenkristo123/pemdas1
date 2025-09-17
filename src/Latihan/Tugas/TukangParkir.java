package Latihan.Tugas;

import java.util.Scanner;

public class TukangParkir {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double menitParkir = Double.parseDouble(input.nextLine());
       String kendaraan = input.nextLine();
       double jamParkir = menitParkir / 60;

       if (menitParkir <= 0) {
        System.out.println("Misiiii input ga valid nihh!!");
        input.close();
        return;
       }

       double biaya = 0;
       double menitLebih = menitParkir - 120;
       double biayaTambah = Math.ceil(menitLebih / 10);

       if (menitParkir <= 5) {
        biaya = 3000;
        System.out.printf("Biaya parkir %s hanya %,.2f karena hanya %d menit", kendaraan, biaya, (int)menitParkir);
       } else if (menitParkir <= 120) {
        biaya = 5000;
        System.out.printf("Biaya parkir %s selama %.1f jam adalah Rp %,.2f", kendaraan, jamParkir, biaya);
       } else if (menitParkir > 120 && kendaraan.equalsIgnoreCase("Motor")) {
        biaya = 5000 + (biayaTambah * 1000);
        System.out.printf("Biaya parkir %s selama %.1f jam adalah Rp %,.2f", kendaraan, jamParkir, biaya);
       } else if (menitParkir > 120 && kendaraan.equalsIgnoreCase("Mobil")) {
        biaya = 5000 + (biayaTambah * 2000);
        System.out.printf("Biaya parkir %s selama %.1f jam adalah Rp %,.2f", kendaraan, jamParkir, biaya);
       } else {
        System.out.println("Jalan kaki tidak perlu bayar parkir");
       }
    }
}     



    

