package javaquestionsbank.ternary;

public class Ternary_04 {
    public static void main(String[] args) {
        /*
        Nested Ternary kullanarak Apex kodunu yazınız.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir
         */

        int year =2023;

        String s = (year % 100 == 0)? (year% 400 == 0 ? "Artik Yil" : "Artik Yil Degil") : (year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil");

        System.out.println(s);



    }
}
