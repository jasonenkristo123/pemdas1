package Latihan.Practice;

import java.util.Scanner;
public class SwitchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai dari A-E: ");
        char nilai = input.next().toUpperCase().charAt(0);
        String predikat;

        switch (nilai) {
            case 'A':
                predikat = "Istimewa";
            break;
            case 'B':
                predikat = "Baik";
            break;
            case 'C':
                predikat = "Cukup";
            break;
            case 'D':
                predikat = "Kurang";
            break;
            case 'E':
                predikat = "Gagal";
            break;
            default:
                predikat = "Nilai tidak valid";
        }
        System.out.println("Predikat anda: " + predikat);
        input.close();
    }
}
