package Latihan.CaseBased;

import java.util.Scanner;

public class CaseBased1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean tutupWarung = false;

        System.out.println("===================================");
        System.out.println("   SISTEM KASIR WARUNG NUSANTARA   ");
        System.out.println("===================================");

        // looping buat melayani pelanggan
        while (tutupWarung == false) {
            int totalBelanja = 0;
            int jumlahNasiGoreng = 0;
            int jumlahAyamBakar = 0;
            int jumlahSoto = 0;
            int jumlahEsTeh = 0;
            int jumlahEsJeruk = 0;
            boolean beliAyamBakar = false;

            System.out.println("--- TRANSAKSI BARU ---");

            // menampilkan menu terlebih dahulu
            System.out.println("    DAFTAR MENU:");
            System.out.println("1. Nasi Goreng Spesial - Rp 15.000");
            System.out.println("2. Ayam Bakar Madu     - Rp 25.000");
            System.out.println("3. Soto Ayam Lamongan  - Rp 12.000");
            System.out.println("4. Es Teh Manis        - Rp 5.000");
            System.out.println("5. Es Jeruk            - Rp 7.000");

            // input pesanan untuk pelanggan
            boolean lanjutPesan = true;
            while (lanjutPesan == true) {
                System.out.print("Pilihan menu(1-5): ");
                int kodeMenu = input.nextInt();

                System.out.print("Masukkan jumlah: ");
                int jumlah = input.nextInt();

                if (kodeMenu == 1) {
                    jumlahNasiGoreng += jumlah;
                    totalBelanja += jumlah * 15000;
                    System.out.println("Menambahkan " + jumlah + " Nasi Goreng Spesial");
                } else if (kodeMenu == 2) {
                    jumlahAyamBakar += jumlah;
                    totalBelanja += jumlah * 25000;
                    if (jumlah >= 1) {
                        beliAyamBakar = true;
                    }
                    System.out.println("Menambahkan " + jumlah + " Ayam Bakar Madu");
                } else if (kodeMenu == 3) {
                    jumlahSoto += jumlah;
                    totalBelanja += jumlah * 12000;
                    System.out.println("Menambahkan " + jumlah + " Soto Ayam Lamongan");
                } else if (kodeMenu == 4) {
                    jumlahEsTeh += jumlah;
                    totalBelanja += jumlah * 5000;
                    System.out.println("Menambahkan " + jumlah + " Es Teh");
                } else if (kodeMenu == 5) {
                    jumlahEsJeruk += jumlah;
                    totalBelanja += jumlah * 7000;
                    System.out.println("Menambahkan " + jumlah + " Es Jeruk");
                } else {
                    System.out.println("Kode menu tidak valid");
                }
                System.out.print("Mau tambah lagi? (Ya/Tidak): ");
                String jawaban = input.next();
                if (jawaban.equalsIgnoreCase("Tidak")) {
                    lanjutPesan = false;
                }
            }
            if (totalBelanja == 0) {
                    System.out.println("Tidak ada pesanan");
                    System.out.print("Mau lanjut ke pelanggan berikutnya? (Ya/Tidak): ");
                    String lanjut = input.next();
                    if(lanjut.equalsIgnoreCase("Tidak")) {
                        tutupWarung = true;
                    }
                    continue;
                }
                // menanyakan informasi tambahan
                System.out.println("Apakah hari ini hari jumat? (Ya/Tidak): ");
                String hari = input.next();

                System.out.print("Makan di (tempat/bungkus)? jika bungkus menambah 2000 per makanan: ");
                String tipeLayanan = input.next();

                // untuk menyimpan total awal
                int totalAwal = totalBelanja;

                // menghitung bagian diskon
                int diskonBelanja = 0;
                if (totalBelanja > 100000) {
                    diskonBelanja = totalBelanja * 15 / 100;
                    System.out.println("Dapat diskon belanja senilai 15%: Rp " + diskonBelanja );
                } else if (totalBelanja > 50000) {
                    diskonBelanja = totalBelanja * 10 / 100;
                    System.out.println("Dapat diskon belanja senilai 10%: Rp " + diskonBelanja );
                }
                totalBelanja -= diskonBelanja;

                // hitung diskon spesial jumat
                int diskonJumat = 0;
                if (hari.equalsIgnoreCase("Ya") && beliAyamBakar == true) {
                    diskonJumat = 5000;
                    totalBelanja -= diskonJumat;
                    System.out.println("Mendapatkan diskon senilai 5000 karena hari jumat");
                }

                // menghitung biaya bungkus
                int biayaBungkus = 0;
                int jumlahMakanan = 0;
                jumlahMakanan = jumlahNasiGoreng + jumlahAyamBakar + jumlahSoto;
               
                if (tipeLayanan.equalsIgnoreCase("Bungkus")) {
                    biayaBungkus = jumlahMakanan * 2000;
                    System.out.println("Biaya bungkus: " + biayaBungkus);
                }
                // hitung pajak
                int pajak = totalBelanja * 10 / 100;
                int totalAkhir = totalBelanja + pajak;

                // cetak struk belanja\
                System.out.println("===================================");
                System.out.println("      WARUNG MAKAN NUSANTARA       ");
                System.out.println("           STRUK BELANJA           ");
                System.out.println("===================================");

                System.out.println("PESANAN: ");
                 if (jumlahNasiGoreng > 0) {
                System.out.println("Nasi Goreng Spesial " + jumlahNasiGoreng + " x 15000 = " + (jumlahNasiGoreng * 15000));
                }
                if (jumlahAyamBakar > 0) {
                System.out.println("Ayam Bakar Madu " + jumlahAyamBakar + " x 25000     = " + (jumlahAyamBakar * 25000));
                }
                if (jumlahSoto > 0) {
                System.out.println("Soto Ayam Lamongan " + jumlahSoto + " x 12000  = " + (jumlahSoto * 12000));
                }
                if (jumlahEsTeh > 0) {
                System.out.println("Es Teh Manis " + jumlahEsTeh + " x 5000         = " + (jumlahEsTeh * 5000));
                }
                if (jumlahEsJeruk > 0) {
                System.out.println("Es Jeruk " + jumlahEsJeruk + " x 7000             = " + (jumlahEsJeruk * 7000));
                }
            
                System.out.println("------------------------------------");
                System.out.println("Total Awal          : Rp " + totalAwal);

                if (diskonBelanja > 0) {
                    System.out.println("Diskon belanja      : Rp " + diskonBelanja);
                }
                 if (diskonJumat > 0) {
                System.out.println("Diskon Jumat        : -Rp " + diskonJumat);
                }
                if (biayaBungkus > 0) {
                System.out.println("Biaya Bungkus       : +Rp " + biayaBungkus);
                }

                System.out.println("Setelah Diskon/Biaya: Rp " + totalBelanja);
                System.out.println("Pajak 10%           : Rp " + pajak);
                System.out.println("========================================");
                System.out.println("TOTAL BAYAR         : Rp " + totalAkhir);
                System.out.println("========================================");

                if (tipeLayanan.equalsIgnoreCase("Bungkus")) {
                    System.out.println("PESANAN DIBUNGKUS");
                } else {
                    System.out.println("MAKAN DI TEMPAT");
                }
                System.out.println("Terima Kasih Sudah Belanja");

                System.out.println("Apakah ada pelanggan lagi? (Ya/Tidak): ");
                String pelanggan = input.next();
                if (pelanggan.equalsIgnoreCase("Tidak")) {
                    tutupWarung = true;
                }
                System.out.println("Warung Telah Di Tutup. Selamat Datang Kembali Besok");
            }
        }
    }
