package javaquestionsbank.loops;

public class Loops_18 {
    /*
    Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
Örneğin; Missisippi-->M
     */

    public static void main(String[] args) {


        String str = "Missisippi";

        for (int i = 0; i <str.length() ; i++) {
            String harf = str.substring(i,i+1);
            if (str.indexOf(harf)==str.lastIndexOf(harf)){
                System.out.println(harf);
            }

        }

        /*
         Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; Missisippi-->isp
         */

        String s = "Missisippi";
        String bos = "";
        for (int i = 0; i <s.length() ; i++) {
            String letter = s.substring(i,i+1);
            if (s.indexOf(letter)!=s.lastIndexOf(letter)){
                if (!bos.contains(letter)){
                    bos+=letter;
                }

            }


        }System.out.println(bos);



    }
}
