package Latihan.Practice;
import java.util.Scanner;
public class PakBudi {
    static void tampilkanDaftarBuah(String[] namaBuah, int[] stokBuah, int[] hargaBuah) {
        System.out.println("=== Daftar Buah ===");
        System.out.printf("%-20s %-20s %-20s", "Buah", "Stok", "Harga");
        for (int i = 0; i < namaBuah.length; i++) {
            System.out.printf("\n%-20s %-20d %-20d\n", namaBuah[i], stokBuah[i], hargaBuah[i]);
        }
    }

    static int inputPilihanBuah(Scanner in) {
        System.out.print("Mau beli buah apa? (0-3): ");
        int pilih = in.nextInt();
        if (pilih > 4 || pilih < 1) {
            System.out.println("pilihan out of range");
            return -1;
        }
        return pilih;
    }

    static int inputJumlahKilo (Scanner in) {
        System.out.print("Beli berapa kilo?: ");
        int jumlah = in.nextInt();
        
        if (jumlah <= 0) {
            System.out.println("Minim beli 1 bos");
            return -1;
        }
        return jumlah;
    }

    static boolean prosesPembelian(String[] namaBuah, int[] stokBuah, int[] hargaBuah, int pilih, int jumlah) {
        if (stokBuah[pilih] >= jumlah) {
            int total = hargaBuah[pilih] * jumlah;
            stokBuah[pilih] = stokBuah[pilih] - jumlah;

            System.out.println("=== Struk Belanja Kamu ===");
            System.out.println("Kamu membeli buah " + namaBuah[pilih]);
            System.out.println("Jumlah yang kamu beli: " + jumlah);
            System.out.println("Total harga: " + total);
            return true;
        } else {
        System.out.println("stok cuman tersisa " + stokBuah[pilih] + " maaf");
        return false;
        }
    }

    static void tampilkanStokKritis (String[] namaBuah, int[] stokBuah) {
        System.out.println("== Daftar Buah Yang Stoknya Kritis");
        for (int i = 0; i < namaBuah.length; i++) {
        if (stokBuah[i] <= 20) {
            System.out.println(namaBuah[i] + ", Stok sisa: " + stokBuah[i]);
        }
    }
}    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String namaBuah [] = {"Apel", "Jeruk", "Mangga", "Pisang"};
        int stokBuah [] = {30, 50, 35, 45};
        int hargaBuah[] = {10000, 15000, 20000, 17000};

        tampilkanDaftarBuah(namaBuah, stokBuah, hargaBuah);
        
        int pilih = inputPilihanBuah(in);

        int jumlah = inputJumlahKilo(in);

        prosesPembelian(namaBuah, stokBuah, hargaBuah, pilih, jumlah);

        tampilkanStokKritis(namaBuah, stokBuah);
    }
}
