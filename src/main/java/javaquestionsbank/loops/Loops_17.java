package javaquestionsbank.loops;

public class Loops_17 {
    /*
    Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
     */

    public static void main(String[] args) {

//        int sayi = 123456;
//        String sayiS = String.valueOf(sayi);
//        String bos = "";
//       // System.out.println(sayiS);
//        for (int i = 0; i <sayiS.length();  i++) {
//            String rakam = sayiS.substring(i,i+1);
//
//
//            }System.out.println(bos);

        int num = 55555;
        int rakam =0;
        for (int i = num; i >0 ; i=i/10) {
            rakam+=i%10;
        }
        System.out.println(rakam);



    }

}



