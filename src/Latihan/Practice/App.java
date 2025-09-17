package Latihan.Practice;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tanggal: ");

        int tanggal = input.nextInt();
        System.out.println("Masukkan bulan beli: ");
        
        int bulan = input.nextInt();
        System.out.println("Masukkan tahun beli: ");

        int tahun = input.nextInt();
        System.out.println("Barang belanja: ");

        input.nextLine(); // consume newline

        String barang = input.nextLine();
        System.out.println("Jumlah barang: ");

        int jumlah = input.nextInt();
        System.out.println("Harga barang: ");

        double harga = input.nextDouble();
        System.out.println("Diskon: ");

        double diskon = input.nextDouble();
        System.out.println("Pembayaran Tunai? : ");
        boolean tunai = input.nextBoolean();

        double total = (harga * (int)jumlah);
        double pembayaran = total - (total * diskon / 100);
        
        System.out.println("=========== List Barang ===========");
        System.out.printf("%-20s: %s\n", "Tanggal" , tanggal, bulan, tahun);
        System.out.printf("%-20s: %s\n", "Barang belanja", barang);
        System.out.printf("%-20s: %d\n", "Jumlah barang", jumlah);
        System.out.printf("%-20s: %,.1f\n", "Harga barang", harga);
        System.out.printf("%-20s: %,.1f %%\n", "Diskon", diskon);
        System.out.println("-----------------------------------");
        System.out.printf("%-20s: Rp%,.2f\n", "Total harga", total);
        System.out.printf("%-20s: Rp%,.2f\n", "Pembayaran", pembayaran);
        System.out.println("Pembayaran tunai: " + tunai);
    }
}
