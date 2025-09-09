package Latihan.Tugas;

import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan berapa derajat celcius: ");
        float celcius = input.nextFloat();
        input.close();
        float fahrenheit = (celcius * 9 / 5 + 32);
        System.out.println("termometer menunjukkan " + fahrenheit + " derajat fahrenheit");
    }
}
