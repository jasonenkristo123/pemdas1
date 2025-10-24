package Latihan.Zatian;
import java.util.Scanner;

public class latian {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int angka = (int) (Math.random() * 100); // angka acak 0 sampai 100
    int tebakan = 0;

    while (tebakan != angka) {
        System.out.print("Masukkan tebakan angka: ");
        int tebakanpengguna = in.nextInt();

        if (tebakanpengguna < angka) {
            System.out.println("angka terlalu kecil");
        } else if (tebakanpengguna > angka) {
            System.out.println("angka kebesaran");
        } else {
            System.out.println("kamu berhasil menebaknya keren!"); tebakan = angka;
        }
        }
    }
}

// latian array
class inarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah angka: ");
        int jumlah = in.nextInt();

        int[] array = new int[jumlah];
        

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        int nilaimin = array[0];
        int nilaimax = array[0];
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];

            if (array[i] > nilaimax) {
                nilaimax = array[i];
            } else if (array[i] < nilaimin) {
                nilaimin = array[i];
            }
        }

        double rata = total / jumlah;

        System.out.println("rata-rata: " + rata);
        System.out.println("nilai min = " + nilaimin);
        System.out.println("nilai max = " + nilaimax);
    }
}

class BelajarStringBuilder {
    public static void main(String[] args) {
        // Membuat StringBuilder
        StringBuilder sb = new StringBuilder("Halo");

        // 1. append() → menambahkan string di akhir
        sb.append(" Dunia");
        System.out.println("Setelah append: " + sb);

        // 2. insert() → menyisipkan string di posisi tertentu
        sb.insert(5, " Java");
        System.out.println("Setelah insert: " + sb);

        // 3. delete() → menghapus sebagian karakter
        sb.delete(5, 10); // hapus " Java"
        System.out.println("Setelah delete: " + sb);

        // 4. replace() → mengganti bagian string
        sb.replace(5, sb.length(), " Programmer");
        System.out.println("Setelah replace: " + sb);

        // 5. reverse() → membalik string
        sb.reverse();
        System.out.println("Setelah reverse: " + sb);

        // Balik lagi supaya mudah dipahami
        sb.reverse();

        // 6. charAt() → ambil karakter tertentu
        char c = sb.charAt(0);
        System.out.println("Karakter pertama: " + c);

        // 7. setCharAt() → ubah karakter di posisi tertentu
        sb.setCharAt(0, 'h');
        System.out.println("Setelah setCharAt: " + sb);

        // 8. substring() → ambil potongan string
        String sub = sb.substring(5);
        System.out.println("Substring dari index 5: " + sub);

        // 9. length() dan capacity()
        System.out.println("Panjang string: " + sb.length());
        System.out.println("Kapasitas buffer: " + sb.capacity());

        // 10. toString() → konversi ke String biasa
        String hasil = sb.toString().toUpperCase(); // contoh manipulasi
        System.out.println("Konversi ke String (uppercase): " + hasil);

        // 11. deleteCharAt() → hapus 1 karakter
        sb.deleteCharAt(0);
        System.out.println("Setelah deleteCharAt(0): " + sb);
    }
}



class DekripsiKode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input ID sebagai kunci dasar
        System.out.print("Masukkan ID (kunci dasar): ");
        int id = input.nextInt();
        
        // Input panjang kode
        System.out.print("Masukkan panjang kode (n): ");
        int n = input.nextInt();
        
        // Input array kode
        int[] arr = new int[n];
        System.out.println("Masukkan " + n + " angka kode:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        // Variabel untuk menyimpan hasil
        StringBuilder pesan = new StringBuilder();
        int[] invalid = new int[n];
        int jumlahInvalid = 0;
        
        // Konstanta untuk rentang huruf A-Z (26 huruf)
        int XX = 25;
        
        // Proses dekripsi
        for (int i = 0; i < n; i++) {
            // Aturan 1: ID hingga (ID + 25) -> A-Z
            if (arr[i] >= id && arr[i] <= id + XX) {
                int posisi = arr[i] - id;
                char huruf = (char) ('A' + posisi);
                pesan.append(huruf);
            }
            // Aturan 2: (ID + 26) -> spasi
            else if (arr[i] == id + XX + 1) {
                pesan.append(" ");
            }
            // Aturan 3: angka tidak valid
            else {
                invalid[jumlahInvalid] = arr[i];
                jumlahInvalid++;
            }
        }
        
        // Output hasil
        System.out.println("\nOutput pesan: " + pesan.toString());
        
        // Tampilkan elemen tidak valid jika ada
        if (jumlahInvalid > 0) {
            System.out.print("Elemen tidak valid ditemukan: ");
            for (int i = 0; i < jumlahInvalid; i++) {
                System.out.print(invalid[i]);
                if (i < jumlahInvalid - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Tidak ada elemen tidak valid.");
        }
        
        input.close();
    }
}

class setres1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int jumlah = in.nextInt();
        int arr[] = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            arr[i] = in.nextInt();
        }
        int nilai = arr[0];
        int frekuensi = 0;
        for (int i = 0; i < jumlah; i++) {
            int hitung = 0;
            for (int j = 0; j < jumlah; j++) {
                if (arr[i] == arr[j]) {
                hitung++; 
                }
            }
                if (hitung > frekuensi || (hitung == frekuensi && arr[i] < nilai)) {
                frekuensi = hitung;
                nilai = arr[i];
            }
        }
        
        System.out.println("Nilai: " + nilai);
        System.out.println("Frekuensi: " + frekuensi);
        System.out.print("Indeks: ");
        for (int i = 0; i < jumlah; i++) {
            if (arr[i] == nilai) {
                System.out.print(i + " ");
            }
        }
    }
}

class setres2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String huruf = in.nextLine();
        StringBuilder sb = new StringBuilder(huruf);
        
        String potong = huruf.substring(2, 6);
        sb.replace(3, 4, "X");
        
        System.out.println(potong);
        System.out.println(sb.toString());
    }
}