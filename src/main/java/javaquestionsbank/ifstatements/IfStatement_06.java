package javaquestionsbank.ifstatements;

import java.util.Scanner;

public class IfStatement_06 {
    public static void main(String[] args) {
        /*
        Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak
         */

        Scanner input = new Scanner(System.in);
        boolean donusturucu = true;

        do {

            System.out.println("Lutfen Donusum Yapmak Icin Asagidaki Degerlerden Birini Seciniz :" +
                    "\nMil'den Kilometreye Donusum Yapmak Icin 1;" +
                    "\nSaniye'den Saate Donusum Yapmak Icin 2;" +
                    "\nFahrenheit'tan Santigrat'a Donusum Yapmak Icin 3;" +
                    "\nCikmak Icin Q yaziniz.");
            String secim = input.next();

            if (secim.equalsIgnoreCase("Q")){
                donusturucu=false;
            }

            switch (secim){
                case "1":
                    System.out.println("Donusum Yapmak Istediginiz Mil Degerini Giriniz");
                    double mil = input.nextDouble();
                    double km = mil * 1.60;
                    System.out.println(mil+" = " + km +" km'dir");
                    break;
                case "2":
                    System.out.println("Donusum Yapmak Istediginiz Saniye Degerini Giriniz");
                    double saniye = input.nextDouble();
                    double saat = saniye / 3600;
                    System.out.println(saniye +" = "+ saat+" saat'tir");
                    break;
                case "3":
                    System.out.println("Donusum Yapmak Istediginiz Fahrenheit Degerini Giriniz");
                    double fahrenheit = input.nextDouble();
                    double celcius = (fahrenheit-32)/1.8;
                    System.out.println(fahrenheit + " = " + celcius + "santigrat derecedir");
                    break;
                    default:
                        break;

            }

        }while (donusturucu);








    }
}
