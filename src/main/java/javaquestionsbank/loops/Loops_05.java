package javaquestionsbank.loops;

public class Loops_05 {
    /*
    Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            A A A A A
            A A A A A
            A A A A A
     */
    public static void main(String[] args) {

        int rows = 3;
        int columns= 5;
        for (int i = 1; i <=rows; i++) {//Satir Kontrol
           String s = "";//Hiclik Vermezsek ilk Satiri Bos Birakiyor
            for (int j = 1; j <=columns ; j++) {// Sutun Kontrol
                s+="A ";
            }
            System.out.println(s);
        }

        System.out.println("****************************************");
        /*
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *


         */

        int satir = 4;
        int sutun =6;

        for (int i = 1; i <=satir ; i++) {
           String s ="";
            for (int j =1 ; j <=sutun ; j++) {
                s+="* ";
            }
            System.out.println(s);
        }


        System.out.println("****************************************");



        for (int i = 1; i < 6; i++) {
            String s = "";
            for (int j = 1; j < 6; j++) {
                s+="& ";

            }
            System.out.println(s);

        }




























    }
}
