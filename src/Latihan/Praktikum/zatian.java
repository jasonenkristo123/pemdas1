package Latihan.Praktikum;

public class zatian {
    public static void main(String[] args) {
        String a = "Halo Guys";
        String b = "Ngengok Banget Sih Kamu";
        System.out.println(a.concat(" ").concat(b));

        StringBuilder sb = new StringBuilder("Woi");

        sb.append(a);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String t = "    ProGramMing ";
        System.out.println(t.trim());

    }
}

class string1 {
    public static void main(String[] args) {
        String fruits = "Apple,Bananas,Brian";
        String[] parts = fruits.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println();
    }
}

class string2 {
    public static void main(String[] args) {
        String math = "Brian susuka marjan";
        System.out.println(math.replace("marjan", "marji"));
        System.out.println(math.length());
        System.out.println(math.contains("marjan"));
        System.out.println(math.substring(0, 10));
        System.out.println(math.split("\\s+"));
        System.out.println(math.toUpperCase());
    }
}
