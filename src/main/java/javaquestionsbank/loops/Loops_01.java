package javaquestionsbank.loops;

public class Loops_01 {
    public static void main(String[] args) {
        /*
        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız
         */
   for(int i = 120 ; i>10; i--){
       if (i%4==0&&i%6==0){
           System.out.print(i+ " ");}}

        System.out.println();
        String s = "";
        for(Integer j=120; j>10; j--){
            if(j%4==0 && j%6==0){
                s = s + j + " ";
            }
        }
        System.out.println(s);


       }}






