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

class method {
    static int sum(int x, int y) {
            return x * y;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 2));
    }
}