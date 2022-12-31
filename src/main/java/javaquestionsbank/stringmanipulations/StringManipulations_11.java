package javaquestionsbank.stringmanipulations;

public class StringManipulations_11 {

    public static void main(String[] args) {
        /*
        Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
         */

        String s = "Ali";
        Boolean s1 = s.startsWith(" ");
        Boolean s2 = s.endsWith(" ");
        System.out.println(!s1);
        System.out.println(!s2);




    }
}
