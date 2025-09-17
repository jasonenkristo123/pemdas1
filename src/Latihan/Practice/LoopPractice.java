package Latihan.Practice;

import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int duit_jajan, jumlah = 0, hari;
        
        for (hari = 1; hari <= 7; hari++) {
        System.out.print("masukkan uang: ");
        duit_jajan = input.nextInt();
        jumlah+=duit_jajan;
        }
        System.out.println("rata rata adalah: " + (jumlah / 4));
    }
}

class Loop2 {
    public static void main(String[] args) {
        int jumlahsiswa = 10;
        int i = 1;
        System.out.println("menggunakan while loop");
        while (i <= jumlahsiswa) {
            System.out.println("siswa ke-" + (i) + " nilainya di cetak");
            i++;
        }
    }  
}

class Loop3 {
    public static void main(String[] args) {
        for (int i = 11; i <= 188; i+=2) {
            System.out.println(i);
        }
    }
}

class Loop4 {
    public static void main(String[] args) {
        int i = 67;
            while (i % 2 == 1 && i >= 11 && i <=188) {
                System.out.println(i);
                i++;
            
        }
    }
}