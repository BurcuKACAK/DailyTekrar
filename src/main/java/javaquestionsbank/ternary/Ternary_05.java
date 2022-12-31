package javaquestionsbank.ternary;

public class Ternary_05 {
    public static void main(String[] args) {
        /*
        Nested Ternary kullanarak;
        Şifreyi kontrol etmek için kodu yazınız.
        8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır
         */

        String sifre = "abcd12345";

       boolean dogruMu = sifre.length()>8 ? sifre.charAt(0)=='i' : sifre.charAt(0)== 'K';

        System.out.println(dogruMu);

        System.out.println("***************************************************************************");
        String p = "XXXXXXXXX";
        String r = p.length()>8 ? p.startsWith("i") ? "Gecerli": "Gecersiz": p.startsWith("K") ? "Gecerli ":
                "Gecersiz";
        System.out.println(r);
    }
}
