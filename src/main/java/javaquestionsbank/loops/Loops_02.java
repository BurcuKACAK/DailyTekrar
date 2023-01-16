package javaquestionsbank.loops;

public class Loops_02 {
    public static void main(String[] args) {

        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces


        String str = "accessories";
        String bos="";

        for (int i = 0 ; i<str.length(); i++){
            String harf = str.substring(i,i+1);
            if (str.indexOf(harf)!=str.lastIndexOf(harf)){
                if (!bos.contains(harf)){
                    bos+=harf;
                }
            }
        }System.out.println(bos);



        System.out.println("******************************");


        String x = "Missisippi";
        String y = "";

        for (int i = 0; i < x.length(); i++) {

            String q = x.substring(i, i + 1);

            if (x.indexOf(q) != x.lastIndexOf(q)) {
                if (!y.contains(q)) {

                    y = y + q;

                }

            }

        }
        System.out.println(y);


        String s = "Misssippi";
        String t = "";

        for (int i = 0; i < s.length(); i++) {
            char u = s.charAt(0);

            if (s.indexOf(u) != s.lastIndexOf(u)) {
                // if (!t.contains(u)){
                t += u;

            }

        }

    }
    // System.out.println();


}




