package javaquestionsbank.loops;

public class Loops_03 {
    public static void main(String[] args) {
        /*
        Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır
         */

       String str = "anna";
       String bos = "";

        for (int i = str.length()-1; i >-1 ; i--) {
            String m = str.substring(i,i+1);
            bos+=m;
         }

        if (str.equals(bos)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome Degil");
        }
    }
}
