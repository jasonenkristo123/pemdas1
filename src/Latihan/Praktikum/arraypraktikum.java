package Latihan.Praktikum;

import java.util.Arrays;
import java.util.Scanner;

public class arraypraktikum {
    public static void main(String[] args) {
        int matriks [][] = {
        {1, 2, 3}, 
        {4, 5, 6}};

        System.out.println("isi array matriks: ");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class arprak { 
    public static void main(String[] args) {
        int arr1 [] = {1, 2, 3};
        int arr2 [] = arr1; // shallow copy, dimana nilai arr1 akan keganti 
        arr2 [0] = 99;

        // deep copy
        int arr3[] = Arrays.copyOf(arr1, arr1.length);
        arr3[0] = 20; // deep copy, nilainya akan beda karena hanya copy isinya saja
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);

    }
}

class arprak1 {
    public static void main(String[] args) {
        
        
    }
}

 class ContohSimpleStringBuilder {

    public static void main(String[] args) {

        // Membuat StringBuilder dengan teks awal "Java"
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Bentuk Awal          : " + sb);
        System.out.println("-------------------------------------");

        // 1. append() - Menambahkan teks di bagian akhir
        sb.append(" itu Menyenangkan");
        System.out.println("Setelah append()     : " + sb);

        // 2. insert() - Menyisipkan teks di posisi tertentu
        // Kita sisipkan "Belajar " di indeks 0 (paling depan)
        sb.insert(0, "Belajar ");
        System.out.println("Setelah insert()     : " + sb);

        // 3. replace() - Mengganti sebagian teks
        // Kita ganti kata "Menyenangkan" menjadi "Mudah"
        // Pertama, cari posisi kata "Menyenangkan"
        int indexAwal = sb.indexOf("Menyenangkan");
        int indexAkhir = indexAwal + "Menyenangkan".length();
        sb.replace(indexAwal, indexAkhir, "Mudah");
        System.out.println("Setelah replace()    : " + sb);
        
        // 4. length() - Mengetahui panjang string saat ini
        System.out.println("Panjang (length)     : " + sb.length() + " karakter");

        // 5. reverse() - Membalik urutan semua karakter
        sb.reverse();
        System.out.println("Setelah reverse()    : " + sb);
        
        // Balikkan lagi agar kembali normal sebelum diubah ke String
        sb.reverse(); 
        
        System.out.println("-------------------------------------");
        // 6. toString() - Mengubah StringBuilder menjadi String
        String hasilAkhir = sb.toString();
        System.out.println("Hasil final (String) : " + hasilAkhir);
        System.out.println("Tipe data hasil akhir: " + hasilAkhir.getClass().getSimpleName());
    }
}



class DemoManipulasiString {
    public static void main(String[] args) {

        System.out.println("=============================================");
        System.out.println("=   Kumpulan Contoh Manipulasi String Java  =");
        System.out.println("=============================================");

        // --- 1. Menggabungkan String (Concatenation) ---
        System.out.println("\n--- 1. Menggabungkan String ---");
        String namaDepan = "Andi";
        String namaBelakang = "Wijaya";
        // Cara 1: Menggunakan operator '+'
        String namaLengkap1 = namaDepan + " " + namaBelakang;
        System.out.println("Hasil (+): " + namaLengkap1);
        
        // Cara 2: Menggunakan StringBuilder (lebih efisien untuk banyak data)
        StringBuilder sb = new StringBuilder();
        sb.append(namaDepan).append(" ").append(namaBelakang);
        String namaLengkap2 = sb.toString();
        System.out.println("Hasil (StringBuilder): " + namaLengkap2);

        // --- 2. Mengambil Sebagian String (Substring) ---
        System.out.println("\n--- 2. Mengambil Sebagian String (Substring) ---");
        String kalimat = "Pemrograman Java itu menyenangkan";
        System.out.println("Kalimat asli: \"" + kalimat + "\"");
        String kataJava = kalimat.substring(12, 16); // Mengambil dari indeks 12 hingga sebelum 16
        String sisaKalimat = kalimat.substring(17); // Mengambil dari indeks 17 hingga akhir
        System.out.println("Hasil substring(12, 16): " + kataJava);
        System.out.println("Hasil substring(17)    : " + sisaKalimat);

        // --- 3. Mengubah Huruf Besar/Kecil (Case Conversion) ---
        System.out.println("\n--- 3. Mengubah Huruf Besar/Kecil ---");
        String namaKota = "Malang";
        System.out.println("Asli: " + namaKota);
        System.out.println("Menjadi huruf besar (toUpperCase): " + namaKota.toUpperCase());
        System.out.println("Menjadi huruf kecil (toLowerCase): " + namaKota.toLowerCase());

        // --- 4. Mencari Posisi atau Keberadaan Teks (Searching) ---
        System.out.println("\n--- 4. Mencari Teks ---");
        String data = "user-data-penting.csv";
        System.out.println("Teks asli: " + data);
        System.out.println("Posisi '-' pertama (indexOf): " + data.indexOf('-'));
        System.out.println("Posisi '-' terakhir (lastIndexOf): " + data.lastIndexOf('-'));
        System.out.println("Apakah mengandung 'penting' (contains): " + data.contains("penting"));
        System.out.println("Apakah diawali 'user' (startsWith): " + data.startsWith("user"));
        System.out.println("Apakah diakhiri '.txt' (endsWith): " + data.endsWith(".txt"));

        // --- 5. Mengganti Karakter atau Teks (Replacing) ---
        System.out.println("\n--- 5. Mengganti Teks ---");
        String pesan = "Cuaca hari ini sangat cerah.";
        System.out.println("Pesan asli: " + pesan);
        String pesanBaru = pesan.replace("cerah", "mendung");
        System.out.println("Pesan baru: " + pesanBaru);

        // --- 6. Menghapus Spasi di Awal dan Akhir (Trimming) ---
        System.out.println("\n--- 6. Menghapus Spasi (Trimming) ---");
        String inputPengguna = "   Budi S.   ";
        System.out.println("Sebelum di-trim: '" + inputPengguna + "'");
        String inputBersih = inputPengguna.trim();
        System.out.println("Setelah di-trim: '" + inputBersih + "'");

        // --- 7. Memecah String menjadi Array (Splitting) ---
        System.out.println("\n--- 7. Memecah String (Splitting) ---");
        String daftarEmail = "budi@gmail.com,siti@yahoo.com,andi@outlook.com";
        System.out.println("Data asli: " + daftarEmail);
        String[] arrayEmail = daftarEmail.split(",");
        System.out.println("Hasil split menjadi array: " + Arrays.toString(arrayEmail));
        // Mencetak satu per satu
        System.out.println("Mencetak isi array:");
        for (String email : arrayEmail) {
            System.out.println("- " + email);
        }
        
        System.out.println("\n=============================================");
        System.out.println("=              Selesai Belajar             =");
        System.out.println("=============================================");
    }
}
