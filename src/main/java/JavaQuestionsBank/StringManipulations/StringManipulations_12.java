package JavaQuestionsBank.StringManipulations;

public class StringManipulations_12 {
    public static void main(String[] args) {
        /*
        Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
        ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        ‘ALI.’ için kodunuz konsolda true yazdırmalıdı
         */

        String s ="Ali.";

        char sIlk = s.charAt(0);
        char sSon = s.charAt(s.length()-1);
        boolean sIlkBuyukMu = sIlk>='A'&& sIlk<='Z';
        boolean sSonNoktaMi = sSon=='.';
        boolean sorununCevabi = sIlkBuyukMu &&sSonNoktaMi;
        System.out.println("Ilk Karakter Buyuk ve Son Karakter Nokta Mi? : " + sorununCevabi );
































        String m = "Ayse Betul.";
        char ilk = m.charAt(0);
        char son = m.charAt(m.length()-1);
        boolean ilkBuyukMu = ilk>='A' && ilk<= 'Z';
        boolean sonNoktaMi = son == '.';
        boolean cevap = ilkBuyukMu && sonNoktaMi;
        System.out.println("Sorunun Cevabi : "+cevap);



    }
}
