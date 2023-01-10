package javaquestionsbank.loops;

public class Loops_02 {
    public static void main(String[] args) {

        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces


        String a = "Madonna";
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            String c = a.substring(i, i + 1);

            if (a.indexOf(c) != a.lastIndexOf(c)) {
                if (!b.contains(c)) {
                    b += c;
                }
            }

        }
        System.out.println(b);


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




