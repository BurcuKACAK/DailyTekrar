package javaquestionsbank.ifstatements;

public class IfStatement_07_Tekrar {
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

        String isim = "Ali Can";
        String isimilkHarf = isim.substring(0,1);
        int boslukIndex = isim.trim().indexOf(" ");
        String soyIsimIlkHarf = isim.substring(boslukIndex+1,boslukIndex+2);
        //System.out.println(soyIsimIlkHarf);
        boolean isimilkHarfBuyukMu = isimilkHarf.charAt(0)>='A' && isimilkHarf.charAt(0)<='Z';
        boolean soyIsimIlkHarfBuyukMu = soyIsimIlkHarf.charAt(0)>='A' && soyIsimIlkHarf.charAt(0)<='Z';
        String boslukYok =isim.replaceAll("\\s" , "");


        if(!isimilkHarfBuyukMu || !soyIsimIlkHarfBuyukMu){
            System.out.println("Bas Harflerinde Hata");

        }if (isim.equals(isim.toUpperCase())){
            System.out.println("Format hatası");

        }if (boslukYok.length()==0){
            System.out.println("Isim Girilmedi");

        }if (boslukIndex==-1){
            System.out.println("Ad veya Soyad Eksik");

        }if (boslukYok.replaceAll("[A-Za-z]" , "").length()>0){
            System.out.println("Gecersiz Ad");
        }


    }
}
