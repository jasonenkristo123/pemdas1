package Latihan.Practice;

public class ArrayPemdas {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        a[0] = 10;
        int [] b = new int[] {10, 22, 45, 33}; 
        int avg = b.length;
        int total = 0;
        for (int sum : b) {
            total = sum / avg;
        }
        for (int num : a) {
            System.out.println(num);
        }
        System.out.println("rata rata nilai b: " + total);
    }
}
