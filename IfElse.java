public class IfElse {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int a = 10, b = 20, c = 5, d = 1;

        //? operatörü uygulaması.

        boolean compare = (a == b);
        String str = compare ? "Esittir." : "Esit Degildir.";
        System.out.println(str);

        //If-Else uygulaması.

        if (compare) {
            a = 50;
            System.out.println("A sayısı 50 dir.");
            System.out.println("A sayısı B sayısına eşittir.");
        } else {
            System.out.println("A sayısı B sayısına eşit değildir.");
        }

        //if-elseif-else uygulaması.

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("A sayısı en küçüktür.");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("B sayısı en küçüktür");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("C sayısı en küçüktür");
        } else {
            System.out.println("D sayısı en küçüktür");
        }

        System.out.println("Program bitti.");

    }
}