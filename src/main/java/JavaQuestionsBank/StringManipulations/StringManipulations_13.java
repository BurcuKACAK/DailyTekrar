package JavaQuestionsBank.StringManipulations;

public class StringManipulations_13 {
    public static void main(String[] args) {
        /*
        Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
sembol olmalıdır.
Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
 '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
 '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
 '! a b 3 k' kodunuz konsolda false yazdırmalıdır
         */

        String sifre = "1ab4esff";
        boolean sifreUzunlugu = sifre.replaceAll(" ", "").length()>7;
        boolean sifreSembol = sifre.replaceAll("\\w" , "").length()>0;
        boolean sifreGecerliMi = sifreUzunlugu && sifreSembol;
        System.out.println(sifreGecerliMi);












    }
}
