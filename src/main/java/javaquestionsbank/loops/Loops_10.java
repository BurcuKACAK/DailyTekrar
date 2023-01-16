package javaquestionsbank.loops;

public class Loops_10 {
    public static void main(String[] args) {
        /*
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238 ´ *4*2*3*8
         */



        double x = 75.4238;
        String number = String.valueOf(x);
        for (int i = number.indexOf(".")+1; i <number.length() ; i++) {
            System.out.print("*"+number.charAt(i));


        }



        }




}
