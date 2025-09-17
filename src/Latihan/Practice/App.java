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

class App1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga dan jumlah barang: ");
        double harga = input.nextDouble();
        int jumlah = input.nextInt();
        double total = harga * jumlah;
        System.out.println("Total harga: " + total);
        input.close();
    }
}

class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tehKotak = 5000;
        int kopiSusu = 7000;
        int airMineral = 3000;

        int saldo = 0;

        while (true) {
            System.out.println("----------- Vending Machine ----------");
            System.out.println("1. Teh Kotak (Rp 5000)");
            System.out.println("2. Kopi Susu (Rp 7000)");
            System.out.println("3. Air Mineral (Rp 3000)");
            System.out.println("--------------------------------------");
            System.out.println("Saldo Anda: Rp " + saldo);
            System.out.println("Menu: ");
            System.out.println("1. Isi saldo");
            System.out.println("2. Beli minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("masukkan jumlah saldo yang ingin diisi: ");
                    int isiSaldo = input.nextInt();
                    saldo += isiSaldo;
                    System.out.println("Saldo berhasil diisi. Saldo Anda sekarang: Rp " + saldo);
                    break;
                case 2:
                    System.out.println("Masukkan nomor minuman yang ingin dibeli: ");
                    int pilihan = input.nextInt();
                    int jumlah = input.nextInt();
                    int totalHarga = 0;
                    if (pilihan == 1 && saldo >= totalHarga) {
                        totalHarga = tehKotak * jumlah;
                        saldo -= totalHarga;
                        System.out.println("Anda membeli " + jumlah + " Teh Kotak. Sisa saldo: Rp " + saldo);
                    } else if (pilihan == 2 && saldo >= totalHarga) {
                        totalHarga = kopiSusu * jumlah;
                        saldo -= totalHarga;
                        System.out.println("Anda membeli " + jumlah + " Kopi Susu. Sisa saldo: Rp " + saldo);
                    } else if (pilihan == 3 && saldo >= totalHarga) {
                        totalHarga = airMineral * jumlah;
                        saldo -= totalHarga;
                        System.out.println("Anda membeli " + jumlah + " Air Mineral. Sisa saldo: Rp " + saldo);
                    } else {
                        System.out.println("Pilihan minuman tidak valid.");
                        break;
                    }
                    case 3:
                        System.out.println("Terima kasih telah menggunakan Vending Machine.");
                        return; 
                    default: 
                        System.out.println("Menu tidak valid. Silakan coba lagi.");
                        break;
            }
        }
    }
}
