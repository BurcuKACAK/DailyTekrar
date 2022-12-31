package javaquestionsbank.Ternary;

import java.util.Scanner;

public class Ternary_02 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Ucgenin Kenar Uzunluklarini Giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        String ucgenMi = a==b && b==c ? "Eskenar Ucgen" :
                a==b || b==c || a==c ? "Ikizkenar Ucgen" :
                        "Cesit Kenar Ucgen";

        System.out.println(ucgenMi);



















    }
}
