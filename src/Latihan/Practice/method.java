package Latihan.Practice;

public class method {
    public static int faktorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(faktorial(3));
    }
}

class predikat {
    private static boolean isHabisDibagi (int x, int y) {
        return x % y == 0;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isHabisDibagi(i,7)) {
                System.out.println(i);
            }
        }
    }
}
