package javaquestionsbank.stringmanipulations;

public class StringManipulations_02 {
    public static void main(String[] args) {
        /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
            Örnek: İsimler Burcu Mehmet, Ayse Betul, Ahmet Said ise konsolda 22 görmelisiniz
         */

        String a = "Burcu Mehmet";
        String b = "Ayse Betul";
        String c = "Ahmet Said";
        int a1 = a.replaceAll(" ", "").length();
        int b1 = b.replaceAll(" ", "").length();
        int c1 = c.replaceAll(" ", "").length();

        System.out.println("Bosluksuz Karakter Sayisi ="+ (a1+b1+c1));


    }
}
