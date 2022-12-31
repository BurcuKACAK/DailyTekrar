package javaquestionsbank.stringmanipulations;

public class StringManipulations_16 {
    public static void main(String[] args) {
        /*
         Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
         Not: İkinci isim kapsam dışındadır.
         Örnek: Tom Hanks ==> TH, Mary Star ==> MS
         */


        String isim = "Ayse Betul";
        String ilk = isim.substring(0,1);
        String son = isim.split(" ")[1].substring(0,1);
        System.out.println(ilk+son);


        String m = "ahmet said";
        String ilkM = m.substring(0,1);
        String sonM = m.split(" ")[1].substring(0,1);
        System.out.println((ilkM+sonM).toUpperCase());




    }
}
