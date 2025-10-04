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
                    for (int i = 0; i < jumlahdata; i++) {
                        System.out.println("Data saat ini: " + data[i]);
                }
                break;

                case 3:
                    for (int i = 0; i < jumlahdata; i++) {
                        sum += data[i];
                }
                avg = sum / jumlahdata;
                System.out.println("Average: " + avg);
                break;

                case 4: 
                    for (int i = 0; i < jumlahdata; i++) {
                        sum += data[i];
                }
                System.out.println("Sum: " + sum);
                break;
                
                case 5: 
                    for (int i = 0; i < jumlahdata; i++) {
                        int nilaimax = data[0];
                        if (data[i] > nilaimax) {
                            nilaimax = data[i];        
                    }
                    System.out.println("Nilai max: " + nilaimax);
                }
                break;
                
                case 6: 
                    for (int i = 0; i < jumlahdata; i++) {
                        int nilaimin = data[0];
                        if (data[i] < nilaimin) {
                            nilaimin = data[i];
                    }
                    System.out.println("Nilai max: " + nilaimin);
                }
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
