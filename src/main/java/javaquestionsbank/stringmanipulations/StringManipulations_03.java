package javaquestionsbank.stringmanipulations;

public class StringManipulations_03 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir
         */
    String a = "  Miami  33018!!  ";
        int a1 = a.trim().replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println("Toplam Alfabetik ve Sayisal Karakter Sayisi = "+ a1);



    }
}
