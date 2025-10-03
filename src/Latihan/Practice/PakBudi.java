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
    }
}
