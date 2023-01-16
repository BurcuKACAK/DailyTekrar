package javaquestionsbank.loops;

public class Loops_16 {
    /*
    Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
     */

    public static void main(String[] args) {

        String str = "Seni Seviyorum Java";
        String bos = "";


        for (int i = 0;  i <str.length() ; i++) {
            String harf =str.substring(i, i+1);
            if (harf.equals("m")){
                break;
            } bos+=harf;

        }
        System.out.println(bos);




    }



}
