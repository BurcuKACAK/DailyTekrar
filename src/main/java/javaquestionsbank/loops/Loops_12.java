package javaquestionsbank.loops;

public class Loops_12 {
    /*
    Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A

     */
    public static void main(String[] args) {

        int row = 4, column = 8;

        for (int i = 1; i <=row ; i++) {
            String s="";

            if (i==1){
                for (int j = 1; j <=column ; j++) {
                    s+="A ";
                }
                System.out.println(s);
        }else {
                s+="A ";
                for (int j = 2; j <column ; j++) {
                    s+= "X ";

                } s+="A ";
                System.out.println(s);
            }

        }


    }
}
