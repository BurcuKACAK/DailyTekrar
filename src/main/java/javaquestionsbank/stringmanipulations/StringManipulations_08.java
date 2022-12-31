package javaquestionsbank.stringmanipulations;

public class StringManipulations_08 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız
         */



        String s = "Kadriye";
        int son = s.length()-1;

        System.out.println(s.substring(0,son).toUpperCase());



        String str = "Said";
        int str1 = str.length()-1;

        System.out.println(str.substring(0,str1).toUpperCase());





    }
}
