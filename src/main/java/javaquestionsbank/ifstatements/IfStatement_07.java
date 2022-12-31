package javaquestionsbank.ifstatements;

public class IfStatement_07 {
    public static void main(String[] args) {
        /*
        Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
    a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
    b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
    c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
    d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
    yazmalıdır.
    e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
    yazmalıdır.
    Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
    görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
      "Geçersiz Ad"
         */

        String isim = "Ali CaN";
        String adinIlkHarfi = isim.substring(0,1);
        //System.out.println(adinIlkHarfi);
        Integer boslukIndex = isim.trim().indexOf(' ');
        //System.out.println(boslukIndex);
        //int indexOfSpace = 3;
        String soyadinIlkHarfi = isim.substring(boslukIndex+1,boslukIndex+2);
        //System.out.println(soyadinIlkHarfi);
        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
        Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');


        if(boslukIndex ==-1){
            System.out.println("Ad veya soyadi eksik ");
        }
        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata");
        }
        if(isim.equals(isim.toUpperCase())){
            System.out.println("Format hatasi");
        }
        if(isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi ");
        }
        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz Isim");

        }else {
            System.out.println("Gecerli Isim");
        }









    }
}
