package Latihan.Nugas;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal beli: ");
        int tanggalBeli = input.nextInt();

        System.out.print("Masukkan bulan beli: ");
        int bulanBeli = input.nextInt();

        System.out.print("Masukkan tahun beli: ");
        int tahunBeli = input.nextInt();
        
        input.nextLine();

        System.out.print("Belanja barang apa: ");
        String belanjaBarang = input.nextLine();
        
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        System.out.print("Harga barangnya berapa: ");
        double hargaBarang = input.nextDouble();

        System.out.print("Diskon berapa persen: ");
        float diskon = input.nextFloat();

        System.out.print("Jenis pembayaran apakah tunai: ");
        boolean jenisPembayaran = input.nextBoolean();

        System.out.println("========== List Barang ==========");
        System.out.printf("%-15s: %s\n", "Tanggal", tanggalBeli + "-" + bulanBeli + "-" + tahunBeli);
        System.out.printf("%-15s: %s\n", "Barang Belanja ", belanjaBarang);
        System.out.printf("%-15s: %d\n", "Jumlah Barang ", jumlahBarang);
        System.out.printf("%-15s: %,.2f\n", "Harga Barang ", hargaBarang);
        System.out.printf("%-15s: %.2f%%\n", "Diskon", diskon);
        System.out.println("---------------------------------");
        System.out.printf("%-15s: %,.2f\n", "Total harga ", jumlahBarang * hargaBarang);
        System.out.printf("%-15s: %,.2f\n", "Pembayaran ", jumlahBarang * hargaBarang - (jumlahBarang * hargaBarang * diskon / 100));
        System.out.println("Pembayaran tunai: " + jenisPembayaran);
    }
}
      