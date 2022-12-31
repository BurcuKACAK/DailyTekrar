package javaquestionsbank.ifstatements;

public class IfStatement_08 {
    public static void main(String[] args) {
        /*
        ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
        Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
        küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
        yazmalıdır
         */

        String eyaletKisaltma = "FL";
        boolean fazlaKisaltma = eyaletKisaltma.length()>2;
        if (eyaletKisaltma.length()>2){
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        }if (eyaletKisaltma.toLowerCase().length()==0){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
        }if (eyaletKisaltma.replaceAll("[A-Za-z]", "").length()!=0){
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
        }




    }
}
