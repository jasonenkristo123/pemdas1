package Latihan.Nugas;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tanggalBeli = input.nextInt();
        int bulanBeli = input.nextInt();
        int tahunBeli = input.nextInt();
        input.nextLine();
        String belanjaBarang = input.nextLine();
        int jumlahBarang = input.nextInt();
        double hargaBarang = input.nextDouble();
        float diskon = input.nextFloat();
        boolean jenisPembayaran = input.nextBoolean();
        input.close();

        System.out.println("========== List Barang ==========");
        System.out.printf("%-17s: %s\n", "Tanggal", tanggalBeli + "-" + bulanBeli + "-" + tahunBeli);
        System.out.printf("%-17s: %s\n", "Barang Belanja ", belanjaBarang);
        System.out.printf("%-17s: %d\n", "Jumlah Barang ", jumlahBarang);
        System.out.printf("%-17s: %,.2f\n", "Harga Barang ", hargaBarang);
        System.out.printf("%-17s: %.2f%%\n", "Diskon", diskon);
        System.out.println("---------------------------------");
        System.out.printf("%-17s: %,.2f\n", "Total harga ", jumlahBarang * hargaBarang);
        System.out.printf("%-17s: %,.2f\n", "Pembayaran ", jumlahBarang * hargaBarang - (jumlahBarang * hargaBarang * diskon / 100));
        System.out.printf("%-15s: %s\n", "Pembayaran tunai ", jenisPembayaran);
    }
}
