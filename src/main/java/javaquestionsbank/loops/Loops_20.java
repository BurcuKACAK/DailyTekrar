package javaquestionsbank.loops;

public class Loops_20 {
    /*
    Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                * * * * * *
                * * * * *
                * * * *
                * * *
                * *
                *
     */
    public static void main(String[] args) {


        for (int i = 7; i >0 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
