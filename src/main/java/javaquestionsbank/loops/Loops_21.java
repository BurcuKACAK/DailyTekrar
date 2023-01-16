package javaquestionsbank.loops;

public class Loops_21 {
    /*
    Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
Örnek:12133455 ´ 2+4=6
     */
    public static void main(String[] args) {
        int sayi =12133455;
       String  sayiS =String.valueOf(sayi);
       int bos = 0;
        for (int i = 0; i <sayiS.length() ; i++) {
            String rakam = sayiS.substring(i,i+1);
            if (sayiS.indexOf(rakam)==sayiS.lastIndexOf(rakam)){
                    bos=bos+Integer.valueOf(rakam);
            }

        }System.out.println(bos);
    }
}
