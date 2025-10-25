package Latihan.Praktikum;
import  java.util.*;

public class utp {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int jumlah = in.nextInt();
        in.nextLine();
        String nama[] = new String[jumlah];
        
        System.out.println("Masukkan " + jumlah + " nama lengkap");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            nama[i] = in.nextLine();
        }
        
        String inisial = in.nextLine().trim();
        System.out.println();
        
        System.out.println("Inisial dari setiap nama: ");
        for (int i = 0; i < jumlah; i++) {
            String bagian[] = nama[i].trim().split("\\s+");
            System.out.print(nama[i] + " -> ");

            for (String kata : bagian) {
                System.out.print(Character.toUpperCase(kata.charAt(0)) + ".");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Nama yang berawalan huruf " + "'" + inisial.toUpperCase() + "'");
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (nama[i].trim().toLowerCase().startsWith(inisial.toLowerCase())) {
                String[] bagian = nama[i].split("\\s+");
                String hasilnama = "";
                for (String kata : bagian) {
                    hasilnama += kata.substring(0, 1).toUpperCase() + kata.substring(1).toLowerCase() + " ";
                }
                System.out.println(hasilnama.trim());
                ditemukan = true;
                } 
            }
            if (!ditemukan) {
            System.out.println("Tidak ada nama yang berawalan " + "'" + inisial.toUpperCase() + "'");
        }
        
        int totalhuruf = 0;
        for (int i = 0; i < jumlah; i++) {
            totalhuruf += nama[i].replace(" ", "").length();
        }
        System.out.println("Total huruf (tanpa spasi): " + totalhuruf);
    }
}
    

class utp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        boolean[][] kursi = new boolean[n][m];
        int harga = -1;
        int jumlahterisi = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                kursi[i][j] = in.nextBoolean();
                if (kursi[i][j]) {
                    jumlahterisi++;
                }
            }
        }
        int jumlahinput = in.nextInt();
        in.nextLine();
        
        for (int p = 0; p < jumlahinput; p++) {
            String perintah = in.next();
            
            if (perintah.equals("CEK_KURSI")) {
                for (int i = 0; i < n; i++) {
                    for(int j = 0; j < m; j++) {
                        if (kursi[i][j]) {
                            System.out.print("X");
                        } else {
                            System.out.print("O");
                        }
                        if (j < m - 1) System.out.print(" ");
                    }
                    System.out.println();
                }
            } else if (perintah.equals("SETHARGA")) {
                harga = in.nextInt();
                System.out.println("Harga kursi diubah menjadi " + harga + ".");
            } else if (perintah.equals("PESAN")) {
                int baris = in.nextInt();
                int kolom = in.nextInt();
                
                int i = baris - 1;
                int j = kolom - 1;
                
                if (kursi[i][j]) {
                    System.out.println("Kursi baris " + baris + " kolom " + kolom + " sudah dipesan sebelumnya!");
                } else {
                    kursi[i][j] = true;
                    jumlahterisi++;
                    System.out.println("Kursi baris " + baris + " kolom " + kolom + " berhasil dipesan.");
                } 
            } else if (perintah.equals("HITUNG_PENDAPATAN")) {
                if (harga == -1) {
                    System.out.println("Harga kursi belum ditetapkan!");
                } else {
                    int pendapatan = jumlahterisi * harga;
                    System.out.println("Pendapatan: " + pendapatan);
                }
            } else if (perintah.equals("KOSONGKAN")) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        kursi[i][j] = false;
                    }
                }
                jumlahterisi = 0;
                System.out.println("Semua kursi telah dikosongkan.");
            }
        }
    }
}
    