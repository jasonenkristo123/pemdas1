package Latihan.Practice;
import java.text.NumberFormat;
import java.util.Locale;

public class MataUang {
    public static void main(String[] args) {
        double x = 10000/3.0;
        NumberFormat bilangan = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat mataUang = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat persen = NumberFormat.getNumberInstance(Locale.GERMANY);

        String bilanganStr = bilangan.format(x);
        String mataUangStr = mataUang.format(x);
        String persenStr = persen.format(x);

        System.out.println(bilanganStr);
        System.out.println(mataUangStr);
        System.out.println(persenStr);

    }
}
