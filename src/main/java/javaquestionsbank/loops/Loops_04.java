package javaquestionsbank.loops;

public class Loops_04 {
    public static void main(String[] args) {
     /*
    Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
Örnek; 223878 ´ 3
     */

       
    int num = 223878;
    String numS = String.valueOf(num);
    String bos = "";
        for (int i = 0; i <numS.length() ; i++) {
                String harf = numS.substring(i,i+1);
            if (numS.indexOf(harf)==numS.lastIndexOf(harf)){
                bos+=harf;
            }

        }
        System.out.println(bos);


        System.out.println("******************************************************");
        //Tekrarsizlari yazdir
        int sayi = 234566548;
        String s = String.valueOf(sayi);
        String empty = "";

        for(int i =0 ; i<s.length() ; i++){
          String m = s.substring(i,i+1);
            if (s.indexOf(m)==s.lastIndexOf(m)){
                empty+=m;
            }
        }
        System.out.println(empty);

























}
}
