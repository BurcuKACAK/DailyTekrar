package javaquestionsbank.loops;

public class Loops_11 {
    public static void main(String[] args) {
        /*
        Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
         */
    String s = "Mark";
    String ters = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            ters=ters+s.charAt(i);
            System.out.print(s.charAt(i));}
        System.out.println();
            if (s.equals(ters)){
                System.out.println("Palindrome");
            }else {
                System.out.println("Palindrom Degil");
            }




        System.out.println();
        String str = "Polyanna";
        String tersi ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));

        }
        System.out.println();

        if (str.equals(tersi)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrom Degil");
        }


StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());





























    }
}

//




























