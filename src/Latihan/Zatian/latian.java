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
