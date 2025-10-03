package Latihan.CaseBased;
import java.util.Scanner;

public class StudiKasusArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String namaBuah [] = {"Apel", "Jeruk", "Mangga", "Pisang"};
        int stokBuah[] = {40, 30, 60, 45 };
        double hargaBuah[] = {10000, 20000, 25000, 18000};

        System.out.println("=== DAFTAR BUAH ===");
        for (int i = 0; i < namaBuah.length; i++) {
            System.out.println(namaBuah[i] + "- stok: " + stokBuah[i] + " kg - harga: Rp " + hargaBuah[i]);
        }

        System.out.println("Mau beli buah apa? (0-3): ");
        int pilihan = in.nextInt();
        System.out.println("Mau beli berapa?: ");
        int jumlah = in.nextInt();

        if (pilihan < 0 || pilihan > 4) {
            System.out.println("\nError! Pilihan tidak valid. Pilih antara 0-4 saja.");
        } 
        // Validasi jumlah
        else if (jumlah <= 0) {
            System.out.println("\nError! Jumlah harus lebih dari 0.");
        }
        // Cek stok dan proses
        else if (stokBuah[pilihan] >= jumlah) {
            double total = hargaBuah[pilihan] * jumlah;
            stokBuah[pilihan] = stokBuah[pilihan] - jumlah;
            
            System.out.println("\n--- STRUK ---");
            System.out.println(namaBuah[pilihan] + " x " + jumlah + " kg");
            System.out.println("Total: Rp " + total);
            System.out.println("Terima kasih!");
        } else {
            System.out.println("\nStok tidak cukup! Stok tersisa: " + stokBuah[pilihan]);
        }

        System.out.println("=== Stok Buah Kritis ===");
        for (int i = 0; i < namaBuah.length; i++) {
            if (stokBuah[i] < 30) {
                System.out.println(namaBuah[i] + ": " + stokBuah[i]);
            }
        }
    }
}
