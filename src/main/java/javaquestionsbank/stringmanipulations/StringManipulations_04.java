package javaquestionsbank.stringmanipulations;

public class StringManipulations_04 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        konsolda yazdırınız.
        Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir
         */
    String a= "1a3Bcf4!...";
    int a1 = a.replaceAll("[0-9]" , "").length();
        System.out.println("Rakam Olmayan Karakter Sayisi = " + a1);


    }
}
