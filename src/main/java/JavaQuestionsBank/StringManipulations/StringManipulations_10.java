package JavaQuestionsBank.StringManipulations;

public class StringManipulations_10 {
    public static void main(String[] args) {
        /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
        Örnek:‘Ali Can’ için konsolda false yazmalıdır.
         ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘Ali Can’ için konsolda true yazmalıdır.
         */

        String s = "Ali Can";
        String m = s.trim();
        String s1 = m.replaceAll("\\s", "");
        Boolean s2 = m.length()-s1.length()==1;
        System.out.println(s2);

















        String str = "Love Java";
        String strTrimmed = str.trim();
        String bosluksuz = strTrimmed.replaceAll("\\s" , "");
        Boolean boslukVarmi= strTrimmed.length()-bosluksuz.length()==1;
        System.out.println(boslukVarmi);

















        String k = "Ayse    Betul   ";
        String kTrimmed = k.trim();
        String bosluksuzz = k.replaceAll("\\s" , "");
        Boolean varMi = kTrimmed.length()-bosluksuzz.length()==1;
        System.out.println(varMi);


    }
}
