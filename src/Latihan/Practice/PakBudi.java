package Latihan.Practice;
import java.util.Scanner;
public class PakBudi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String namaBuah [] = {"Apel", "Jeruk", "Mangga", "Pisang"};
        int stokBuah [] = {30, 50, 35, 45};
        int hargaBuah[] = {10000, 15000, 20000, 17000};

        System.out.println("=== Daftar Buah ===");
        for (int i = 0; i < namaBuah.length; i++) {
            System.out.println(namaBuah[i] + ", stok: " + stokBuah[i] + " Harga per kg: " + hargaBuah[i]);
        }
        System.out.println("Beli Buah Apa? (0-3): ");
        int pilih = in.nextInt();

        if (pilih > 3 || pilih < 0) {
            System.out.println("pilihan out of range");
            return;
        }

        System.out.println("Beli berapa kilo?: ");
        int jumlah = in.nextInt();

        if (stokBuah[pilih] >= jumlah) {
            double total = hargaBuah[pilih] * jumlah;
            stokBuah[pilih] = stokBuah[pilih] - jumlah;
            System.out.println("=== Struk Belanja Kamu ===");
            System.out.println("Kamu membeli buah " + namaBuah[pilih]);
            System.out.println("Jumlah yang kamu beli: " + jumlah);
            System.out.println("Total harga: " + total);
        } else if (stokBuah[pilih] < jumlah) {
            System.out.println("stok cuman tersisa " + stokBuah[pilih] + " maaf");
        } else if (jumlah <= 0) {
            System.out.println("minimal beli 1 ya bos");
        }

        System.out.println("== Daftar Buah Yang Stoknya Kritis");
        for (int i = 0; i < namaBuah.length; i++) {
        if (stokBuah[i] < 20) {
            System.out.println(namaBuah[i] + ", Stok sisa: " + stokBuah[i]);
        }
        }
    }
}
