package javaquestionsbank.ifstatements;

import java.util.Scanner;

public class IfStatement_05 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
         */

        double a = 12;
        double b = 12;
        double c = 12;

        boolean eskenarMi = a==b && b==c && a==c;
        boolean ikizkenarMi = a==b||b==c||a==c;

        if (eskenarMi){
            System.out.println("Eskenar Ucgen");
        }else if (ikizkenarMi){
            System.out.println("Ikizkenar Ucgen");
        }else {
            System.out.println("Cesitkenar Ucgen");
        }





    }
}
