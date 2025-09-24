package Latihan.Practice;

import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
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

class Array {
    public static void main(String[] args) {
        int[][] myNumber = {{1, 20, 49, 50}, {20, 30, 40, 50}};
        for (int row = 0; row < myNumber.length; row++) {
            for (int col = 0; col < myNumber[row].length; col++) {
                System.out.println(myNumber[row][col]);
            }
        }
    }
}

class pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n -1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class loop {
    public static void main(String[] args) {
        int x;
        for(int i = 1; i<= 10; i++) {
            if (i >= 5) 
                continue;
            System.out.println(i);
        }
    }
}

class infiniteloop {
    public static void main(String[] args) {
        int x = 10;
        while (true) {
            System.out.println(x); 
            if (x < 12) {
                break;
            }
        }
    }
}

class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan login user1234");
        
        int login;
        int password = 621321;
        
        while(true) {
            System.out.print("Masukkan password: ");
            login = input.nextInt();

            if (login == password) {
                System.out.println("login sukses");
                break;
            }
        }
        
    }
}