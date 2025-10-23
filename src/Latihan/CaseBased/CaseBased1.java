package Latihan.CaseBased;

import java.util.Scanner;

public class CaseBased1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean tutupWarung = false;

        System.out.println("===================================");
        System.out.println("   SISTEM KASIR WARUNG NUSANTARA   ");
        System.out.println("==================================="); 

        while (tutupWarung) {
            System.out.println("--- TRANSAKSI BARU ---");

            tampilkanMenu();

            
            int totalBelanja = 0;
            int jumlahNasiGoreng = 0;
            int jumlahAyamBakar = 0;
            int jumlahSoto = 0;
            int jumlahEsTeh = 0;
            int jumlahEsJeruk = 0;
            boolean beliAyamBakar = false;

            
            boolean lanjutPesan = true;
            while (lanjutPesan) {
                System.out.print("Pilihan menu (1-5): ");
                int kodeMenu = input.nextInt();

                System.out.print("Masukkan jumlah: ");
                int jumlah = input.nextInt();

                totalBelanja = tambahPesanan(kodeMenu, jumlah, totalBelanja);

                if (kodeMenu == 2 && jumlah >= 1) {
                    beliAyamBakar = true;
                }

                if (kodeMenu == 1) jumlahNasiGoreng += jumlah;
                else if (kodeMenu == 2) jumlahAyamBakar += jumlah;
                else if (kodeMenu == 3) jumlahSoto += jumlah;
                else if (kodeMenu == 4) jumlahEsTeh += jumlah;
                else if (kodeMenu == 5) jumlahEsJeruk += jumlah;

                System.out.print("Mau tambah lagi? (Ya/Tidak): ");
                String jawab = input.next();
                if (jawab.equalsIgnoreCase("Tidak")) {
                    lanjutPesan = false;
                }
            }

            if (totalBelanja == 0) {
                System.out.println("Tidak ada pesanan");
                System.out.print("Mau lanjut ke pelanggan berikutnya? (Ya/Tidak): ");
                String lanjut = input.next();
                if (lanjut.equalsIgnoreCase("Tidak")) {
                    tutupWarung = true;
                }
                continue;
            }

            
            System.out.print("Apakah hari ini hari Jumat? (Ya/Tidak): ");
            String hari = input.next();

            System.out.print("Makan di (tempat/bungkus)? ");
            String tipeLayanan = input.next();

            int totalAwal = totalBelanja;

            
            int diskonBelanja = hitungDiskon(totalBelanja);
            totalBelanja -= diskonBelanja;

            
            int diskonJumat = 0;
            if (hari.equalsIgnoreCase("Ya") && beliAyamBakar) {
                diskonJumat = 5000;
                totalBelanja -= diskonJumat;
                System.out.println("Mendapatkan diskon senilai Rp 5000 karena hari Jumat");
            }

            
            int jumlahMakanan = jumlahNasiGoreng + jumlahAyamBakar + jumlahSoto;
            int biayaBungkus = hitungBungkus(tipeLayanan, jumlahMakanan);
            totalBelanja += biayaBungkus;

            
            int pajak = totalBelanja * 10 / 100;
            int totalAkhir = totalBelanja + pajak;

            
            cetakStruk(
                jumlahNasiGoreng, jumlahAyamBakar, jumlahSoto,
                jumlahEsTeh, jumlahEsJeruk,
                totalAwal, diskonBelanja, diskonJumat,
                biayaBungkus, pajak, totalAkhir, tipeLayanan
            );

            System.out.print("Apakah ada pelanggan lagi? (Ya/Tidak): ");
            String pelanggan = input.next();
            if (pelanggan.equalsIgnoreCase("Tidak")) {
                tutupWarung = true;
                System.out.println("Warung Telah Di Tutup. Selamat Datang Kembali Besok!");
            }
        }
    }

    // ================== METHOD ==================

    static void tampilkanMenu() {
        System.out.println("    DAFTAR MENU:");
        System.out.println("1. Nasi Goreng Spesial - Rp 15.000");
        System.out.println("2. Ayam Bakar Madu     - Rp 25.000");
        System.out.println("3. Soto Ayam Lamongan  - Rp 12.000");
        System.out.println("4. Es Teh Manis        - Rp 5.000");
        System.out.println("5. Es Jeruk            - Rp 7.000");
    }

    static int tambahPesanan(int kodeMenu, int jumlah, int totalBelanja) {
        switch (kodeMenu) {
            case 1:
                System.out.println("Menambahkan " + jumlah + " Nasi Goreng Spesial");
                return totalBelanja + jumlah * 15000;
            case 2:
                System.out.println("Menambahkan " + jumlah + " Ayam Bakar Madu");
                return totalBelanja + jumlah * 25000;
            case 3:
                System.out.println("Menambahkan " + jumlah + " Soto Ayam Lamongan");
                return totalBelanja + jumlah * 12000;
            case 4:
                System.out.println("Menambahkan " + jumlah + " Es Teh Manis");
                return totalBelanja + jumlah * 5000;
            case 5:
                System.out.println("Menambahkan " + jumlah + " Es Jeruk");
                return totalBelanja + jumlah * 7000;
            default:
                System.out.println("Kode menu tidak valid");
                return totalBelanja;
        }
    }

    static int hitungDiskon(int totalBelanja) {
        if (totalBelanja > 100000) {
            int diskon = totalBelanja * 15 / 100;
            System.out.println("Dapat diskon belanja 15%: Rp " + diskon);
            return diskon;
        } else if (totalBelanja > 50000) {
            int diskon = totalBelanja * 10 / 100;
            System.out.println("Dapat diskon belanja 10%: Rp " + diskon);
            return diskon;
        }
        return 0;
    }

    static int hitungBungkus(String tipeLayanan, int jumlahMakanan) {
        if (tipeLayanan.equalsIgnoreCase("Bungkus")) {
            int biaya = jumlahMakanan * 2000;
            System.out.println("Biaya bungkus: Rp " + biaya);
            return biaya;
        }
        return 0;
    }

    static void cetakStruk(
    int jumlahNasiGoreng, int jumlahAyamBakar, int jumlahSoto,
    int jumlahEsTeh, int jumlahEsJeruk,
    int totalAwal, int diskonBelanja, int diskonJumat,
    int biayaBungkus, int pajak, int totalAkhir, String tipeLayanan) {
        System.out.println("===================================");
        System.out.println("      WARUNG MAKAN NUSANTARA       ");
        System.out.println("           STRUK BELANJA           ");
        System.out.println("===================================");


    if (jumlahNasiGoreng > 0)
        System.out.println("Nasi Goreng Spesial " + jumlahNasiGoreng + " x 15000 = " + (jumlahNasiGoreng * 15000));
    if (jumlahAyamBakar > 0)
        System.out.println("Ayam Bakar Madu " + jumlahAyamBakar + " x 25000 = " + (jumlahAyamBakar * 25000));
    if (jumlahSoto > 0)
        System.out.println("Soto Ayam Lamongan " + jumlahSoto + " x 12000 = " + (jumlahSoto * 12000));
    if (jumlahEsTeh > 0)
        System.out.println("Es Teh Manis " + jumlahEsTeh + " x 5000 = " + (jumlahEsTeh * 5000));
    if (jumlahEsJeruk > 0)
        System.out.println("Es Jeruk " + jumlahEsJeruk + " x 7000 = " + (jumlahEsJeruk * 7000));

    System.out.println("------------------------------------");
    System.out.println("Total Awal       : Rp " + totalAwal);
    if (diskonBelanja > 0) System.out.println("Diskon Belanja   : Rp " + diskonBelanja);
    if (diskonJumat > 0) System.out.println("Diskon Jumat     : Rp " + diskonJumat);
    if (biayaBungkus > 0) System.out.println("Biaya Bungkus    : Rp " + biayaBungkus);
    System.out.println("Pajak (10%)      : Rp " + pajak);
    System.out.println("===================================");
    System.out.println("TOTAL BAYAR      : Rp " + totalAkhir);
    System.out.println("===================================");
    System.out.println((tipeLayanan.equalsIgnoreCase("Bungkus")) ? "PESANAN DIBUNGKUS" : "MAKAN DI TEMPAT");
    System.out.println("Terima Kasih Sudah Belanja!");
    }
}
    