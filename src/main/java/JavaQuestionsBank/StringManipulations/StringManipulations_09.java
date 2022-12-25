package JavaQuestionsBank.StringManipulations;

public class StringManipulations_09 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız
         */

    String s = "Ahmet";
    int son = s.length()-1;
    System.out.println(s.substring(1,s.length()-1).toUpperCase());

    String s1 = "Burcu";
    System.out.println(s1.substring(1,s1.length()-1).toUpperCase());



    }
}
