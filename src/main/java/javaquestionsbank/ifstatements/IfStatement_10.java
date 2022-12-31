package javaquestionsbank.ifstatements;

import java.util.Scanner;

public class IfStatement_10 {
    public static void main(String[] args) {
        /*
        Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
        yazınız.
        Geçersiz BMI değeri < 0
        Zayıf = <18.5
        Normal ağırlık = 18.5–24.9
        Fazla kilolu = 25–29.9
        Obezite = 30 veya daha büyük BMI
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Vucut Kitle Endeksinizi (BMI) Giriniz");
        double endeksDegeri = input.nextDouble();

        if (endeksDegeri<0){
            System.out.println("Gecersiz BMI Degeri!!! Lutfen Gecerli Bir Deger Giriniz");
        } else if (endeksDegeri<=18.5) {
            System.out.println("Zayif");
        }else if (endeksDegeri>=18.5 && endeksDegeri<=24.9){
            System.out.println("Normal Agirlik");
        }else if (endeksDegeri>=25 && endeksDegeri<=29.9){
            System.out.println("Fazla Kilolu");
        } else if (endeksDegeri>=30) {
            System.out.println("Obezite");

        }


    }
}
