package javaquestionsbank.loops;

public class Loops_09 {
    public static void main(String[] args) {
        /*
        String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 'Ali Can?' ==> l*i*a*n*
         */

        String s = "Ali Can?";

        String m = s.replaceAll("[^a-z]","");

        for (int i = 0; i <m.length() ; i++) {
            String harf = m.substring(i,i+1);
            System.out.print(harf+"*");
        }























   }
}
