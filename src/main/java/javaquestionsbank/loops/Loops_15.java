package javaquestionsbank.loops;

public class Loops_15 {
    /*
    Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
kod yazınız
     */
    public static void main(String[] args) {

       char ch = 'C';
       String s = "";

     do {
         s+=ch;
         ch--;
     }while (ch>='A');
        System.out.println(s);
    }
}
