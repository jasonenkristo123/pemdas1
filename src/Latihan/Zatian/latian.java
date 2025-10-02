package Latihan.Zatian;
import java.util.Scanner;

public class latian {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int angka = (int) (Math.random() * 100); // angka acak 0 sampai 100
    int tebakan = 0;

    while (tebakan != angka) {
        System.out.print("Masukkan tebakan angka: ");
        int tebakanpengguna = in.nextInt();

        if (tebakanpengguna < angka) {
            System.out.println("angka terlalu kecil");
        } else if (tebakanpengguna > angka) {
            System.out.println("angka kebesaran");
        } else {
            System.out.println("kamu berhasil menebaknya keren!"); tebakan = angka;
        }
        }
    }
}

// latian array
class inarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah angka: ");
        int jumlah = in.nextInt();

        int[] array = new int[jumlah];
        

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        int nilaimin = array[0];
        int nilaimax = array[0];
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];

            if (array[i] > nilaimax) {
                nilaimax = array[i];
            } else if (array[i] < nilaimin) {
                nilaimin = array[i];
            }
        }

        double rata = total / jumlah;

        System.out.println("rata-rata: " + rata);
        System.out.println("nilai min = " + nilaimin);
        System.out.println("nilai max = " + nilaimax);
    }
}