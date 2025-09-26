package Latihan.Praktikum;

public class Pengulangan {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i += 10) {
            System.out.println(i);
        }
    }
}

class pengulangan1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++)
            System.out.println(i * j);
        }
    }
}

class array {
    public static void main(String[] args) {
        int[] jasik = {5, 10, 25, 100};
        float sum = 0;
        float avg = 0;
        int length = jasik.length;

        for (int jaran : jasik) {
            sum += jaran;
            
        }
            avg = sum / length;

            System.out.println(avg);
    }
}