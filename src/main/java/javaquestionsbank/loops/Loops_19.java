package javaquestionsbank.loops;

public class Loops_19 {
    /*
    Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz
     */
    public static void main(String[] args) {
        String s= "a.b?c /d*e@ f";
        int krktr= s.replaceAll(" ","").replaceAll("[\\p{Punct}]" ,"").length();
        System.out.println(krktr);




    }
}

