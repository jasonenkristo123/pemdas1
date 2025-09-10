package Latihan.Tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double menitParkir = input.nextDouble();
        input.nextLine();
        String kendaraan = input.nextLine();
        input.close();

        double jamParkir = (menitParkir / 60);
        double tarifParkir = (23000 / menitParkir);
        double hargaParkir = menitParkir * tarifParkir;

        System.out.printf("biaya parkir mobil selama %.1f jam adalah Rp %,.2f", jamParkir, hargaParkir);
    }
}
