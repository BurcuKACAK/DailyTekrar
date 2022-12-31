package javaquestionsbank.ternary;

import java.util.Scanner;

public class Ternary_03 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır.
        123 aşağı yuvarlanacak ve değer 120 olacaktı
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int num = input.nextInt();

        String s = num % 10 >= 5 ? (num / 10+1)*10  + " Son basamagi bir ust ondaliga yuvarla" : (num / 10+1)*10   + " Son basamagi bir alt ondaliga yuvarla";
        System.out.println(s);

    }
}
