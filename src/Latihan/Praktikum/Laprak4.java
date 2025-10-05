package Latihan.Praktikum;
import java.util.Scanner;

public class Laprak4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kodevalid = true;
        int jumlahdata = 0;
        int data[] = new int[100];
        float avg, sum = 0;

        while (kodevalid) {
            System.out.println("Menu: ");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan jumlah data: ");
                    jumlahdata = in.nextInt();
    
                    for (int i = 0; i < jumlahdata; i++) {
                        data[i] = in.nextInt();
                }
                break;

                case 2:
                if (jumlahdata == 0) {
                    System.out.println("Belum ada data");
                } else {
                    for (int i = 0; i < jumlahdata; i++) {
                        System.out.println("Data saat ini: " + data[i]);
                    }
                }
                break;

                case 3:
                sum = 0;
                    for (int i = 0; i < jumlahdata; i++) {
                        sum += data[i];
                }
                avg = sum / jumlahdata;
                System.out.println("Average: " + avg);
                break;

                case 4: 
                sum = 0;
                    for (int i = 0; i < jumlahdata; i++) {
                        sum += data[i];
                }
                System.out.println("Sum: " + sum);
                break;
                
                case 5: 
                int nilaimax = data[0];
                    for (int i = 0; i < jumlahdata; i++) {
                        if (data[i] > nilaimax) {
                            nilaimax = data[i];        
                    }
                }
                System.out.println("Nilai max: " + nilaimax);
                break;
                
                case 6: 
                int nilaimin = data[0];
                    for (int i = 0; i < jumlahdata; i++) {
                        if (data[i] < nilaimin) {
                            nilaimin = data[i];
                    }
                }
                System.out.println("Nilai min: " + nilaimin);
                break;
                case 0: 
                    kodevalid = false;
                    System.out.println("Program selesai, terimakasih");
                    break;
                
                default: 
                System.out.println("Pilihan tidak valid");
            }
        }
    }
}

class keretaApi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] jenis = {"Ekonomi", "Bisnis", "Eksekutif", "Pariwisata"};
        int[] harga = {50000, 100000, 200000, 300000};
        int[] diskon = {2, 5, 7, 10};
        String[] ac = {"Tidak ada", "Ada", "Ada", "Ada"};
        String[] colokan = {"Tidak ada", "Tidak ada", "Tidak ada", "Ada"};

        String[] jenisPesanan = new String[100];
        int[] jumlahPesanan = new int[100];
        double[] totalPesanan = new double[100];
        int jumlah = 0;

        boolean kodeValid = true;
        
        while (kodeValid) {
            System.out.println("========================================");
            System.out.println("      PEMESANAN TIKET KERETA API");
            System.out.println("========================================");
            System.out.println("1. Lihat daftar kereta api");
            System.out.println("2. Lihat kereta api dengan ac");
            System.out.println("3. Lihat kereta api dengan ac dan colokan");
            System.out.println("4. Pesan tiket kereta api");
            System.out.println("5. Lihat pesanan tiket kereta api");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1: 
                System.out.println("Daftar kereta api saat ini: ");
                System.out.printf("%-15s %-12s %-10s %-10s %10s", "Jenis", "Harga", "Diskon(%)", "AC", "Colokan");
                    for (int i = 0; i < jenis.length; i++) {
                        System.out.printf("\n%-15s %-12d %-10s %-12s %-12s\n", jenis[i], harga[i], diskon[i], ac[i], colokan[i]);
                }
                break;
                case 2:
                System.out.printf("%-15s %-12s %-10s %-10s %10s", "Jenis", "Harga", "Diskon(%)", "AC", "Colokan");
                    for (int i = 0; i < jenis.length; i++) {
                        if (ac[i].equals("Ada")) {
                            System.out.printf("\n%-15s %-12d %-10s %-12s %-12s\n", jenis[i], harga[i], diskon[i], ac[i], colokan[i]);
                    }
                }
                break;
                case 3:
                System.out.printf("%-15s %-12s %-10s %-10s %10s", "Jenis", "Harga", "Diskon(%)", "AC", "Colokan");
                    for (int i = 0; i < jenis.length; i++) {
                        if (ac[i].equals("Ada") && colokan[i].equals("Ada")) {
                            System.out.printf("\n%-15s %-12d %-10s %-12s %-12s\n", jenis[i], harga[i], diskon[i], ac[i], colokan[i]);
                    }
                }
                break;
                case 4:
                    System.out.print("Pilih jenis kereta api(1-4): ");
                    int milih = in.nextInt();  

                    if (milih < 1 || milih > jenis.length) {
                        System.out.println("nomor kereta tidak valid");
                    break;
                }
                System.out.print("Jumlah tiket?: ");
                int jumlahTiket = in.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Masa ga beli sih yang bener aje");
                }

                int index = milih - 1;

                double totalSebelumDiskon = harga[index] * jumlahTiket;
                double potongan = totalSebelumDiskon * diskon[index] / 100;
                double totalAkhir = totalSebelumDiskon - potongan;

                jenisPesanan[jumlah] = jenis[index];
                jumlahPesanan[jumlah] = jumlahTiket;
                totalPesanan[jumlah] = totalAkhir;
                jumlah++;

                System.out.println("    DETAIL PESANAN     ");
                System.out.println("Jenis kereta: " + jenis[index]);
                System.out.println("Jumlah tiket: " + jumlahTiket);
                System.out.println("Harga per tiket: " + "Rp " + harga[index]);
                System.out.println("Subtotal       : " + "Rp " + (int) totalSebelumDiskon);
                System.out.println("Diskon         : " + diskon[index] + "%");
                System.out.println("Total Bayar    : " + "Rp " + (int) totalAkhir);
                break;

                case 5: 
                    if (jumlah == 0) {
                        System.out.println("Belum ada pesanan ya bos");
                    } else {
                        System.out.printf("%-10s %-10s %-10s %-10s\n", "No", "Jenis Kereta", "Jumlah", "Total Harga");

                        double totalSemuaPesanan = 0;

                        for (int i = 0; i < jumlah; i++) {
                            System.out.printf("%-10d %-10s %-10d %-10d\n", (i+1), jenisPesanan[i], jumlahPesanan[i], (int) totalPesanan[i]);

                        totalSemuaPesanan += totalPesanan[i];
                        }
                        System.out.println("Total dari semua pesanan: " + (int)totalSemuaPesanan);
                }
                break;
                case 0:
                    System.out.println("Program selesai terimakasih!");
                    kodeValid = false;
                    break;
                
                default: 
                    System.out.println("Invalid kode pilih");
            }
        }
    }
}