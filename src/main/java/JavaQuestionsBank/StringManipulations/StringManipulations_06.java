package JavaQuestionsBank.StringManipulations;

public class StringManipulations_06 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz
         */

            String s = "Betul";
            int son = s.length()-1;
            int ilkAscii = s.charAt(0);
            int sonAscii = s.charAt(son);
            System.out.println("Ilk ve son karakterlerinin ASCII değerleri toplami = " + (ilkAscii+sonAscii));


             String s1 = "Said";
             int s1ilkAscii = s1.charAt(0);
             int s1son= s1.length()-1;
             int s1sonAscii = s1.charAt(s1son);
             System.out.println("Total = " + (s1ilkAscii+s1sonAscii));














    }
}
