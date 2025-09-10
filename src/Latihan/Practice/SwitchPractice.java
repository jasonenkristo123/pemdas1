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

// soal 2

class kerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan hari 1-7 : ");
        int angka = input.nextInt();
        String hari;

        switch (angka) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                hari = "Hari kerja bosku";
            break;
            case 6:
            case 7:
                hari = "Hari libur ya bos";
            break;
            default :
                hari = "Hari tidak valid";
            input.close();
        }
        System.out.println(hari);
    }
}

// buat kalkulator dari switch sederhana

class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        double angka1 = Double.parseDouble(input.nextLine());

        System.out.print("masukkan operator (+, -, *, /) : ");
        String operator = input.nextLine();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean validasiOperator = true;

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
            break;
            case "-":
                hasil = angka1 - angka2;
            break;
            case "*":
                hasil = angka1 * angka2;
            break;
            case "/":
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
            } else {
                    System.out.println("hasil eror karena nanti 0");
                    validasiOperator = false;
            }
            break;
            default:
                System.out.println("Operator tidak valid");
                validasiOperator = false;
                break;
        }
        if (validasiOperator) {
            System.out.println(hasil);
        }
        input.close();
    }
}