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
