package JavaQuestionsBank.StringManipulations;

public class StringManipulations_15 {
    public static void main(String[] args) {
        /*
        String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız
         */

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";

        String g = gomlekFiyat.replaceAll("[$]","");
        String k = kitapFiyat.replaceAll("[$]", "");

        double gomlek = Double.valueOf(g);
        double kitap = Double.valueOf(k);
        System.out.printf("Total Price = "+ "%.2f", (gomlek+kitap));


        System.out.println();

        String elbise = "$ 199.99";
        String kalemlik = "$ 0.76";

        String e = elbise.replaceAll("[$]", "");
        String kk= kalemlik.replaceAll("[$]" , "");

        double elbise1 = Double.valueOf(e);
        double kalemlik1 = Double.valueOf(kk);

        System.out.printf("Total Price = " + "%.2f",(elbise1+kalemlik1));






    }
}
