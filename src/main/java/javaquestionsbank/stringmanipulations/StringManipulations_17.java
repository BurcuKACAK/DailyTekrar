package javaquestionsbank.stringmanipulations;

public class StringManipulations_17 {
    public static void main(String[] args) {
        /*
        Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız
         */

        String s = "Bu cocuklar; haylazliklari, umursamazliklari ile benim omrumu yedi!!!";

        int sUzunluk = s.length();
        int sSembol = s.replaceAll("[\\p{Punct}]", "").length();
        int total = sUzunluk-sSembol;
        System.out.println(total);




        String m = "Annem, babam, abim, halam hep birlikte tatile gittik; orada alisveris yaptik, cok eglendik.";
        int mUzunluk = m.length();
        int mSembol = m.replaceAll("\\p{Punct}" , "").length();
        System.out.println("Sembol Toplami = " + (mUzunluk-mSembol));






    }

}
