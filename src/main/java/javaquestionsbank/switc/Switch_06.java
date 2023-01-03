package javaquestionsbank.switc;

import java.util.Scanner;

public class Switch_06 {
    public static void main(String[] args) {
        /*
        Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
yapan basit bir hesap makinesi oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.
double a = 10.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Iki Sayi Giriniz");
        int sayi1 =scan.nextInt();
        int sayi2 =scan.nextInt();
        System.out.println("Asagidaki islemlerden hangisini yapmak istiyorsaniz belirtiniz:" +
                "\n 1-Toplama Yapmak Icin '+' isareti giriniz," +
                "\n 2-Cikarma Yapmak Icin '-' isareti giriniz," +
                "\n 3-Carpma Yapmak Icin '*' isareti giriniz" +
                "\n 4-Bolme Yapma Icin '/' isareti giriniz");

        String opr = scan.next();

        switch (opr){

            case "+" :
                System.out.println(sayi1 +" + "+sayi2 +" = " +(sayi1+sayi2));
                break;
            case "-" :
                System.out.println(sayi1 +" - "+sayi2 +" = " +(sayi1-sayi2));
                break;
            case "*" :
                System.out.println(sayi1 +" * "+sayi2 +" = " +(sayi1*sayi2));
                break;
            case "/" :
                System.out.println(sayi1 +" / "+sayi2 +" = " +(sayi1/sayi2));
                break;
            default:
                System.out.println("Lutfen Gecerli Degerler Giriniz");

        }






    }
}
